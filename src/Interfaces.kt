interface Machine {
    fun ligar()
    fun desligar()

    var cor : String
}

class NoteBook(override var cor: String) : Machine{
    override fun ligar() {
    }

    override fun desligar() {
    }

    fun Paint(){
        println("Minha cor é $cor")
    }
}

fun main()
{
    val noteBook: NoteBook = NoteBook("Cinza")
    noteBook.Paint()
}