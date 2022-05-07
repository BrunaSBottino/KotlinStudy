import kotlin.system.exitProcess

fun main() {
    println("Bem vindo ao Bytebank")
    var i = 0
    while (i < 5){
        var titular = "Bruna $i"
        val conta = 1000+i
        var saldo = 200.0+i

        println("titular $titular")
        println("numero da conta $conta")
        println("saldo da conta $saldo")
        println()
        i++
    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0 -> println("o saldo da sua conta é positivo")
        saldo == 0.0 -> println("o saldo da conta é $0")
        else -> println("o saldo da sua conta é negativo")
    }
}