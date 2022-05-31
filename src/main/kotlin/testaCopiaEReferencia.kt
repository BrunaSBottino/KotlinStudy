fun testaCopiaEReferencia() {
    var contaRodrigo = Conta("Rodrigo", 1000)
    var contaBruna = contaRodrigo
    contaBruna.titular = "Bruna"

    println("titular conta ${contaRodrigo.titular}")
    println("titular conta ${contaBruna.titular}")
}