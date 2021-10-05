package br.com.mastertech.objetos;

public class Login {
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean estaValido() {
        return this.usuario.equals("admin") && this.senha.equals("123");
    }
}
