package digonebank.Teste

import digonebank.Cliente
import digonebank.ClienteTipo

fun main(){
    val cliente1 = Cliente(
        nome = "Renato Nunes",
        cpf = "11889653446",
        clienteTipo= ClienteTipo.PF,
        senha="123456"
    )
    println(cliente1)

    Teste_Autenticacao().autentica(cliente1)
}