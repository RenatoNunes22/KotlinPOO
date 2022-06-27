package digonebank

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calcularAuxilios() = salario * 0.1
}