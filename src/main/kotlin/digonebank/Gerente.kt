package digonebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome, cpf, salario), Logavel{
    override fun calcularAuxilios(): Double = salario * 1.4
    override fun login(): Boolean = "senha123" == senha
}