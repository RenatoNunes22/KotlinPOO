package digonebank.Teste

import digonebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object {
        fun imprimeRelatorio(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}