package digonebank.Teste

import digonebank.Gerente
fun main(){
    val joao = Gerente(nome = "Renato", cpf="11889653446", salario=1555.02)
    ImprimeRelatorioFuncionario.imprimeRelatorio(joao);
}