fun testaComportamentos() {
    println("Bem vindo ao Bytebank")
    var contaBruna = Conta("Bruna", 1000)
    contaBruna.deposita(200.0)
    println("Conta 1")
    println("Titular da conta")
    println(contaBruna.titular)
    println("Número da conta")
    println(contaBruna.conta)
    println("Saldo da conta")
    println(contaBruna.saldo)


    println()
    var contaRodrigo = Conta("Rodrigo", 1001)
    println("Conta 2")
    contaRodrigo.deposita(300.0)
    println("Titular da conta")
    println(contaRodrigo.titular)
    println("Número da conta")
    println(contaRodrigo.conta)
    println("Saldo da conta")
    println(contaRodrigo.saldo)

    println()
    println("Depositando na conta da Bruna")
    contaBruna.deposita(50.0)
    println(contaBruna.saldo)

    println()
    println("Depositando na conta do Rodrigo")
    contaRodrigo.deposita(40.0)
    println(contaRodrigo.saldo)

    println()
    println("Sacando da conta da Bruna")
    contaBruna.saque(250.0)
    println(contaBruna.saldo)

    println()
    println("Sacando da conta do Rodrigo")
    contaRodrigo.saque(200.0)
    println(contaRodrigo.saldo)

    println()
    println("Sacando da conta da Bruna em excesso")
    contaBruna.saque(250.0)
    println(contaBruna.saldo)

    println()
    println("Tranferindo da conta do Rodrigo para a conta da Bruna")

    if (contaRodrigo.transfere(50.0, contaBruna)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }
    println("Saldo da conta da Bruna é: ${contaBruna.saldo}")
    println("Saldo da conta do Rodrigo é:${contaRodrigo.saldo}")
}
