class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr : Int
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun bonificacao(): Double {
        return salario + plr * 0.3
    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        } else {
            return false
        }
    }
}
