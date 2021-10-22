package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;

public class SaqueStepDefinitions {

    private int saldo;

    @Dado("que joão tinha {int} reais")
    public void que_o_joao_tinha_x_reais(int reais) {
        this.saldo = reais;
    }

    @E("sacou {int}")
    public void sacou(int reais) {
        this.saldo = this.saldo - reais;
    }

    @E("depositou {int}")
    public void depositou(int reais) {
        this.saldo = this.saldo + reais;
    }

    @Entao("o restante na conta foi de {int}")
    public void o_restante_na_conta_foi_de_x(int restante) {
        Assert.assertEquals(restante, this.saldo);
    }

}
