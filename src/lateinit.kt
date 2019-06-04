class CarroNovo {
    /*
     *  lateinit é usado para inicializar uma varíavel mais tarde, dessa forma não precisa inicializar na declaração
     */
    lateinit var marca: String

    fun setMarcaCarro(marca: String): Unit {
        this.marca = marca
    }
}

fun main() {
    val car: CarroNovo = CarroNovo()
    car.setMarcaCarro("Chevrolet")

    println(car.marca)
}
