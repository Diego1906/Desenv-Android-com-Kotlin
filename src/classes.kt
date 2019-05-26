class Pessoa1

class Pessoa2(var nome: String, val anoNascimento: Int)

class Pessoa3(var nome: String, val anoNascimento: Int) {
    fun saudacao() {
        println("Olá, meu nome é $nome")
    }
}

class Maquina(var marca: String) {
    var numero: Int = 0
        get() {
            return field.plus(4)
        }

    var nucleos: Int = 0
        get() {
            return field.plus(3)
        }

    fun printMarca() {
        println("A marca é $marca")
    }
}

fun main() {
    val pessoa: Pessoa3 = Pessoa3("Diego", 1987)

    println("Nome: ${pessoa.nome}")
    println("Ano Nascimento: ${pessoa.anoNascimento}")

    pessoa.saudacao()

    val maquina = Maquina("Toshiba")
    maquina.nucleos = 12
    maquina.numero = 45

    println("**************")
    maquina.printMarca()
    println("**************")
    println(maquina.nucleos)
    println(maquina.numero)
}