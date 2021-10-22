#language: pt

  Funcionalidade: Saque

    Esquema do Cenario:
      Dado que joão tinha <inicial> reais
      E depositou <deposito>
      E sacou <saque>
      Então o restante na conta foi de <restante>

      Exemplos:
        | inicial | deposito | saque | restante |
        | 100     | 30       | 70    | 60       |
        | 110     | 30       | 70    | 70       |
        | 10      | 30       | 40    | 0        |
