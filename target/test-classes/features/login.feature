# language: pt

Funcionalidade: Login de usuário e senha

  O usuário deve conseguir entrar no sistema quando
  informa o login e a senha corretos

  Contexto: login existe
    Dado que o login existe

    Regra: Não pode existir mais de um usuário com o mesmo e-mail
      Cenário: Conseguir fazer login
        Quando preencho o usuario como admin
        E preencho a senha como 123
        Entao meu login é válido

      Cenário: Nao conseguir fazer login
        Quando preencho o usuario como admin
        E preencho a senha como 1234
        Entao meu login não é válido

    Cenário: Nao conseguir fazer login
      Quando preencho o usuario como admin3
      E preencho a senha como 123
      Entao meu login não é válido

  Cenário:
    Dados que os logins são inválidos:
      | usuario | senha |
      | teste   | 123   |
      | teste   | 1234  |
      | tese    | 1234  |