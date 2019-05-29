class Carro() {
    fun ligar() {}
    fun acelerar() {}
    fun desligar() {}
}


fun main() {
    val car: Carro = Carro()


    // Ao invés de chamar os métodos dessa forma, posso chamar da seguinte forma.
    car.ligar()
    car.acelerar()
    car.desligar()

    // With é usado quando quero fazer a chamada de muitos métodos usando a mesma variável.
    with(car) {
        ligar()
        acelerar()
        desligar()
    }
}