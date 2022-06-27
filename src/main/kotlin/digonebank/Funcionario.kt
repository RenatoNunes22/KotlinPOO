package digonebank


abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calcularAuxilios() : Double

    override fun toString(): String = """ 
        nome: ${nome}
        cpf: ${cpf}
        salario: ${salario}
        auxilio: ${calcularAuxilios()}
        """.trimIndent()
}