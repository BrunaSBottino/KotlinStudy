fun testaLaços() {
    var i = 0
    while (i < 5) {
        var titular = "Bruna $i"
        val conta = 1000 + i
        var saldo = 200.0 + i

        println("titular $titular")
        println("numero da conta $conta")
        println("saldo da conta $saldo")
        println()
        i++
    }
}