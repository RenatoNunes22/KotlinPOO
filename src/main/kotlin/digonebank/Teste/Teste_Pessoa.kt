package digonebank.Teste

import digonebank.Pessoa

fun main(){
    val jether = Pessoa(nome = "Rodrigues", cpf = "11889653446");
    println("${jether.nome} - ${jether.cpf}")
}