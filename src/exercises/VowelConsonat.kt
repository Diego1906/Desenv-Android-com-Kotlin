package exercises

fun countVowels(phrase: String): Int {
    var count: Int = 0
    // var newPhrase = phrase.toLowerCase()
    for (p in phrase.toLowerCase()) {
        when (p) {
            'a', 'e', 'i', 'o', 'u' -> {
                count++
            }
        }
    }
    return count
}

fun countVowels2(phrase: String): Int {
    val VOLWES = "aeiou"
    var totalVolwes = 0

    for (letter in phrase) {
        when {
            VOLWES.contains(letter, true) -> {
                totalVolwes++
            }
        }
    }
    return totalVolwes
}

fun countConsonants(phrase: String): Int {
    var count: Int = 0
    for (p in phrase.toLowerCase()) {
        when {
            p != 'a' && p != 'e' && p != 'i' && p != 'o' && p != 'u' && p != ' ' -> {
                count++
            }
        }
    }
    return count
}

fun countConsonants2(phrase: String): Int {
    val VOLWES = "aeiou"
    var totalConsonants: Int = 0

    for (letter in phrase) {
        when {
            VOLWES.contains(letter, true).not() && letter != ' ' -> {
                totalConsonants++
            }
        }
    }
    return totalConsonants
}

fun usingLet() {
    var nome: String? = "Diego "


    if (nome != null)
        println("Nome é $nome")


    nome?.let {
        println("O tamanhdo da string é ${it.length}")
        return
    }
    println("Nome é null")
}

fun main() {

    usingLet()

    println(countVowels2("DIEGO Farias"))
    println(countConsonants2("Aline RAMOS"))
}