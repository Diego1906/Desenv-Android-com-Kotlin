/***************************
 * Interfaces
 ***************************/
interface Animal {
    fun falar(): Unit
    fun dormir(): Unit
    fun comer(): Unit

    fun latir(){
        println("teste")
    }
}


/***************************
 * Classes Abstrata
 ***************************/
abstract class Mamifero(var nome: String) : Animal {
    var peso: Float = 0f

    override fun falar() {
        println("Eu falo da classe pai")
    }

    override fun dormir() {
        println("Estou dormindo classe pai")
    }

    override fun comer() {
        println("Eu como ração")
    }

    open fun mamar() {
        print("Eu sou um mamifero e bebo leite")
    }

    abstract fun andar()

    abstract fun brincar()
}


/***************************
 * Classes Concretas
 ***************************/
class Cachorro(nome: String, peso: Float) : Mamifero(nome) {

    init {
        this.peso = peso
    }

    override fun falar() {
        println("Meu nome é $nome e meu peso é ${this.peso} e eu sou um cachorro")
    }

    override fun andar() {
        println("Um cachorro anda correndo")
    }

    override fun mamar() {
        super.mamar()
        println("\te tomo água, porque sou um cachorro legal")
    }

    override fun comer() {
        super.comer()
        println("\te também como comida porque sou viralata e moro na rua.")
    }


    override fun brincar() {
        println("Cachorros adoram brincar com seus donos. Eu fico muito feliz quando meu dono brinca comigo")
    }
}

class Gato(nome: String, peso: Float) : Mamifero(nome) {

    init {
        this.peso = peso
    }

    override fun falar() {
        println("Olá meu nome é $nome e meu peso é $peso e eu sou um gato")
    }

    override fun dormir() {
        println("Agora vou descansar")
    }

    override fun andar() {
        println("Um gato anda pulando")
    }

    override fun mamar() {
        super.mamar()
        println("\te eu gosto de suco de abacaxi, porque eu sou um gato diferente")
    }

    override fun brincar() {
        println("Eu gosto de brincar quando sou pequeno, depois que cresco fico um gato chato.")
    }

}


/***************************
 * Chamada dos métodos
 ***************************/
fun main() {
    val cao: Animal = Cachorro("Spike", 6f)
    if (cao is Cachorro) {
        with(cao) {
            falar()
            dormir()
            andar()
            mamar()
            comer()
            brincar()
        }
    }

    println()

    when (val cat: Animal = Gato("Zeus", 3.5f)) {
        is Gato -> {
            with(cat) {
                falar()
                dormir()
                andar()
                mamar()
                comer()
                brincar()
            }
        }
    }
}