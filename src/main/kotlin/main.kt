import kotlin.system.exitProcess

fun main() {
    println("Bem vindo ao Bytebank")
    var contaBruna = Conta()
    contaBruna.titular = "Bruna"
    contaBruna.conta = 1000
    contaBruna.saldo = 200.0
    println("Conta 1")
    println("Titular da conta")
    println(contaBruna.titular)
    println("Número da conta")
    println(contaBruna.conta)
    println("Saldo da conta")
    println(contaBruna.saldo)


    println()
    var contaRodrigo = Conta()
    println("Conta 2")
    contaRodrigo.titular = "Rodrigo"
    contaRodrigo.conta = 1001
    contaRodrigo.saldo = 300.0
    println("Titular da conta")
    println(contaRodrigo.titular)
    println("Número da conta")
    println(contaRodrigo.conta)
    println("Saldo da conta")
    println(contaRodrigo.saldo)
}

class Conta{
    var titular = ""
    var conta = 0
    var saldo = 0.0
}
fun testaLaços(){
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