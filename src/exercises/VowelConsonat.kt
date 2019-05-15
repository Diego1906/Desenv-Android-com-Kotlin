package exercises

fun countVowels(phrase: String): Int {
    var count: Int = 0
    // var newPhrase = phrase.toLowerCase()
    for (p in phrase.toLowerCase()) {
        when (p) {
            'a', 'e', 'i', 'o', 'u' -> {
                count += 1
            }
        }
    }
    return count
}

fun countConsonants(phrase: String): Int {
    return 0
}