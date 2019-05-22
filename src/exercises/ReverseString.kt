package exercises

fun reverseUsingSB(str: String): String {
    var index: Int = 1
    var newStr: StringBuilder = StringBuilder()

    while (index <= str.length) {
        newStr.append(str[str.length - index])
        index++
    }
    return newStr.toString()
}

fun reverseUsingLoop(str: String): String {
    var index: Int = str.length - 1
    var strNew: String = ""

    while (index >= 0) {
        strNew += str[index]
        index--
    }
    return strNew
}

fun reverseUsingFunReversed(str: String): String {
    return str.reversed()
}

fun reverseUsingSbReverse(str: String): String {
    return StringBuilder(str).reverse().toString()
}

fun main() {
    println(reverseUsingLoop("Diego"))
    println(reverseUsingSB("Aline"))
    println(reverseUsingFunReversed("Eloise"))
}
