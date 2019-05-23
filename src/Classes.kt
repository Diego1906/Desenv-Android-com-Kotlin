class Pessoa1

class Pessoa2(var nome: String, val anoNascimento: Int)

class Pessoa3(var nome: String, val anoNascimento: Int) {
    fun saudacao() {
        println("Olá, meu nome é $nome")
    }
}

fun main() {
    val pessoa: Pessoa3 = Pessoa3("Diego", 1987)

    println("Nome: ${pessoa.nome}")
    println("Ano Nascimento: ${pessoa.anoNascimento}")

    pessoa.saudacao()
}