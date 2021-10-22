#language: pt

  @conta
  Funcionalidade: Abertura de conta

    @naoexiste
    Cenario: Conta não existia
      Dado que a conta de cpf 12345678909 não exista
      Quando o usuario entrar com o cpf 12345678909
      Então ele deve conseguir criar a conta

    Cenario: A conta já existia
      Dado que a conta de cpf 12345678909 exista
      Quando o usuario entrar com o cpf 12345678909
      Então ele não deve conseguir criar a conta

    Cenario: Conta não existia
      Dado que as contas não existam:
        | 12345678909 |
        | 12345658999 |
      Quando o usuario entrar com o cpf 12345678909
      Então ele deve conseguir criar a conta

