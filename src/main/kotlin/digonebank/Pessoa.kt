package digonebank

class Pessoa {
    var nome : String = "Renato Nunes"

    var cpf: String = "118.896.534-46"
    private set
    inner class Endereco{
        var rua : String = "Rua Teste"
    }

    constructor()

    fun pessoa1() = "$nome e $cpf"
}

fun main(){
    val jether = Pessoa();
    println(jether.pessoa1())
}