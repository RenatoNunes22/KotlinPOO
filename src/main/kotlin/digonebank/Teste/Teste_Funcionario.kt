package digonebank.Teste

import digonebank.Funcionario
import digonebank.Pessoa
import java.math.BigDecimal

fun main(){
    val jether = Pessoa(nome = "Rodrigues", cpf = "11889653446");
    println("${jether.nome} - ${jether.cpf}")

    val joao = Funcionario(nome = "Renato", cpf="11889653446", BigDecimal.valueOf(1555.02))
    println("${joao.nome} - ${joao.cpf} - ${joao.salario}")
}