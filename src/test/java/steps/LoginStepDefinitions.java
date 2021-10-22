package steps;

import br.com.mastertech.objetos.Login;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class LoginStepDefinitions {
    private Login login;

    @Dado("que o login existe")
    public void que_o_login_existe() {
        login = new Login();
    }

    @Quando("preencho o usuario como {word}")
    public void preencho_o_usuario_como(String usuario) {
        this.login.setUsuario(usuario);
    }

    @E("preencho a senha como {word}")
    public void preencho_a_senha_como(String senha) {
        this.login.setSenha(senha);
    }

    @Entao("meu login é válido")
    public void meu_login_e_valido(){
        Assert.assertTrue(this.login.estaValido());
    }

    @Entao("meu login não é válido")
    public void meu_login_nao_e_valido(){
        Assert.assertFalse(this.login.estaValido());
    }

    @Dado("que os logins são inválidos:")
    public void que_os_logins_sao_invalidos(List<Map<String, String>> logins) {
        for (Map<String, String> x : logins) {
            System.out.println("login " + x.get("usuario")
                    + " " + x.get("senha"));
        }

    }
}
