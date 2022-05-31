class ContaCorrente(
    titular: String,
    conta: Int
): Conta(
    titular,
    conta
) {
    override fun saque(valor: Double) {
        val valorComTaxa = valor + 0.1
        super.saque(valorComTaxa)
    }
}