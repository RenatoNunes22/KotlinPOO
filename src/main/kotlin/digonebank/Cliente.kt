package digonebank

import java.time.Clock

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
): Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """""
        nome = ${nome}
        cpf = ${cpf}
        tipo = ${clienteTipo.descricao}
        """.trimIndent()
}