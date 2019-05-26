class Carro() {
    fun ligar() {}
    fun acelerar() {}
    fun desligar() {}
}


fun main() {
    val car: Carro = Carro()

    // With é usado quando quero fazer a chamada de muitos métodos usando a mesma variável.
    with(car) {
        ligar()
        acelerar()
        desligar()
    }
}