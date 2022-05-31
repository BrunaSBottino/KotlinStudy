fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("o saldo da sua conta é positivo")
        saldo == 0.0 -> println("o saldo da conta é $0")
        else -> println("o saldo da sua conta é negativo")
    }
}