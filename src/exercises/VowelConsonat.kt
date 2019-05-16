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
