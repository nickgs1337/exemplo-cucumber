package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ContaStepDefinitions {

    private List<String> cpfsCadastro = new ArrayList<>();

    private String cpfInformado;

    @Before("@conta and @naoexiste")
    public void beforeGeral() {
        System.out.println("before Conta");
    }

    @Dado("que a conta de cpf {word} não exista")
    public void que_a_conta_de_cpf_X_nao_exista(String cpf) {
        garante_que_a_conta_nao_existe(cpf);
    }

    @Dado("que as contas não existam:")
    public void que_as_contas_nao_existam(List<String> cpfs) {
        for (String cpf : cpfs) {
            garante_que_a_conta_nao_existe(cpf);
        }
    }

    @Dado("que a conta de cpf {word} exista")
    public void que_a_conta_de_cpf_X_exista(String cpf) {
        cpfsCadastro.add(cpf);
    }

    @Quando("o usuario entrar com o cpf {word}")
    public void que_o_cpf_e_x_e_o_rg_e_y(String cpf) {
        this.cpfInformado = cpf;
    }

    @Entao("ele deve conseguir criar a conta")
    public void uma_conta_deve_ser_criada() {
        abrir_conta(cpfInformado);
    }

    @Entao("ele não deve conseguir criar a conta")
    public void devo_ser_informado_que_a_conta_ja_existia() {
        nao_consegue_abrir_conta(cpfInformado);
    }

    public void abrir_conta(String cpf) {
        garante_que_a_conta_nao_existe(cpf);
        cpfsCadastro.add(cpf);
    }

    public void garante_que_a_conta_nao_existe(String cpf) {
        for (String cpfCadastrado : cpfsCadastro) {
            Assert.assertNotEquals(cpfCadastrado, cpf);
        }
    }

    public void nao_consegue_abrir_conta(String cpf) {
        boolean existe = false;
        for (String cpfCadastrado : cpfsCadastro) {
            if(cpfCadastrado.equalsIgnoreCase(cpf)) {
                existe = true;
            }
        }
        Assert.assertTrue(existe);
    }
}
