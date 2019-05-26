enum class Prioridade1(val id: Int) {
    BAIXA(1),
    MEDIA(2),
    ALTA(3)
}

enum class Prioridade2(val id: Int) {
    BAIXA(1) {
        override fun toString(): String {
            return "Super baixa agora"
        }
    },
    MEDIA(2),
    ALTA(3)
}

fun main() {
    println("Prioridade 2 - ${Prioridade2.BAIXA}\nId -${Prioridade2.BAIXA.id}\nPosição - ${Prioridade2.BAIXA.ordinal}")
    println()


    println(Prioridade1.BAIXA)
    println(Prioridade1.MEDIA)
    println(Prioridade1.ALTA)
    println()

    for (p in Prioridade1.values()) {
        when (p.name) {
            "MEDIA" -> {
                println("Esse é MEDIA")
            }
            "ALTA" -> {
                println("Esse é ALTA")
            }
            else -> {
                println("Não é verdade")
            }
        }
        println("Nome: ${p.name} - Id: ${p.id} - Posição: ${p.ordinal}")
    }
}

