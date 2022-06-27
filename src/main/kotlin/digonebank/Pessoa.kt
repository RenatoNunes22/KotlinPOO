package digonebank

class Pessoa {
    var nome : String = "Renato Nunes"

    var cpf: String = "118.896.534-46"
    private set
    inner class Endereco{
        var rua : String = "Rua Teste"
    }
}

fun main(){
    val jether = Pessoa();
    println(jether.nome);
    println(jether.cpf);
    println(jether.Endereco().rua);
}