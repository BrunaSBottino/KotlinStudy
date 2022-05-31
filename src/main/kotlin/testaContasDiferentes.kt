fun testaContasDiferentes() {
    val contaPoupanca = ContaPoupança(
        "Bruna",
        1000
    )

    val contaCorrente = ContaCorrente(
        "Rodrigo",
        1002
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo da conta Poupança: ${contaPoupanca.saldo}")
    println()
    println("Saldo da Conta Corrente: ${contaCorrente.saldo}")
    println()
    contaCorrente.saque(100.0)
    println("Saldo da Conta Corrente após o saque: ${contaCorrente.saldo}")
    println()
    contaPoupanca.saque(100.0)
    println("Saldo da Conta Poupança após o saque: ${contaPoupanca.saldo}")
    println()
    contaPoupanca.transfere(100.0, contaCorrente)
    println("Saldo da Conta Poupança após a transferência: ${contaPoupanca.saldo}")
    println("Saldo da Conta Corrente após a transferência: ${contaCorrente.saldo}")
}
