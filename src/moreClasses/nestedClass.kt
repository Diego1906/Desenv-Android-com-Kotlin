package moreClasses

class Computer(val processorModel: String) {

    // CLASSE INTERNA
    inner class Memory(private val level: Int) {
        fun getMemoryLevel(): Int {
            return 70
        }

        fun showProcessorModel() {
            println("O processador atual é $processorModel")
        }

        fun getLevelCurrent(): Int {
            return level
        }
    }

    // CLASSE NORMAL
    class Hardware {
        fun getNameHardware(): String {
            return "GForce Vídeo"
        }
    }
}

fun main(args: Array<String>) {

    /* Quando a classe for interna(INNER) para utilizar a mesma é preciso instânciar a classe externa que neste exemplo
       é Computer antes de instânciar a classe interna(INNER) que no caso é Memory
    */
    val m1: Computer.Memory = Computer("Intel").Memory(10)
    m1.showProcessorModel()
    println("A memória usada é ${m1.getMemoryLevel()}")
    println("O level atual é ${m1.getLevelCurrent()}")


    /* A classe Hardware está contida dentro da classe Computer, porém ela é tratada como uma classe normal e para utilizar
       a mesma é necessário passar o nome da classe externa que no caso é Computer. A classe Computer está sendo utilizada
       como se fosse um namespace neste exemplo
    */
    val h1: Computer.Hardware = Computer.Hardware()
    println("\n${h1.getNameHardware()}")
}