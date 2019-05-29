
// Open é utilizado para deixar a classe ser herdada
open class Maquina2(var marca: String) {

    // Open é utilizado para deixar que a função seja sobrescrita
    open fun minhaMarca() {
        println("Minha marca é $marca")
    }
}

class Computador(marca: String, val nucleos: Int) : Maquina2(marca) {
    fun ligar() {}
    fun desligar() {}

    override fun minhaMarca() {
        println("Novo método")
    }
}

fun main() {

    val computador: Computador = Computador("Dell", 8)

    with(computador) {
        ligar()
        desligar()
        minhaMarca()
    }
}