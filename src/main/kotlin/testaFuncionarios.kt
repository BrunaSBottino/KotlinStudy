fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )
    println()
    println("nome ${alex.nome}")
    println("cargo Analista")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao().toString()}")

    val bruna = Gerente(
        nome = "Bruna",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println()
    println("nome ${bruna.nome}")
    println("cargo Gerente")
    println("cpf ${bruna.cpf}")
    println("salario ${bruna.salario}")
    println("bonificação ${bruna.bonificacao()}")
    if (bruna.autentica(123)) {
        println("Sucesso na autenticação")
    } else {
        println("Falha na autencicação")
    }

    val rodrigo = Diretor(
        nome = "Rodrigo",
        cpf = "333.333.333-33",
        salario = 3000.0,
        senha = 12345,
        plr = 1000
    )

    println()
    println("nome ${rodrigo.nome}")
    println("cargo Diretor")
    println("cpf ${rodrigo.cpf}")
    println("salario ${rodrigo.salario}")
    println("bonificação ${rodrigo.bonificacao()}")
    println("plr ${rodrigo.plr}")
    if (rodrigo.autentica(12345)) {
        println("Sucesso na autenticação")
    } else {
        println("Falha na autencicação")
    }

    val juliana = Auxiliar(
        nome = "Juliana",
        cpf = "444.444.444-44",
        salario = 2500.0
    )

    println()
    println("nome ${juliana.nome}")
    println("cpf ${juliana.cpf}")
    println("cargo Auxiliar")
    println("salario ${juliana.salario}")
    println("bonificação ${juliana.bonificacao()}")
    println()

    val yahgo = Faxineiro(
        nome = "Yahgo",
        cpf = "555.555.555-55",
        salario = 500.0,
    )

    println()
    println("nome ${yahgo.nome}")
    println("cpf ${yahgo.cpf}")
    println("cargo Fxineiro")
    println("salario ${yahgo.salario}")
    println("bonificação ${yahgo.bonificacao()}")
    println()

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(bruna)
    calculadora.registra(rodrigo)
    calculadora.registra(juliana)

    println("o total da bonficação é: ${calculadora.total}")
}