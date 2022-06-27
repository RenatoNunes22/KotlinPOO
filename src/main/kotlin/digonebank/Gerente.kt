package digonebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calcularAuxilios(): Double = salario * 1.4
}