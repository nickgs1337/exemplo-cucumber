# language: pt

Funcionalidade: Login de usuário e senha

  O usuário deve conseguir entrar no sistema quando
  informa o login e a senha corretos

  Cenário: Conseguir fazer login
    Dado que o login existe
    Quando preencho o usuario como admin
    E preencho a senha como 123
    Entao meu login é válido


  Cenário: Nao conseguir fazer login
    Dado que o login existe
    Quando preencho o usuario como admin
    E preencho a senha como 1234
    Entao meu login não é válido