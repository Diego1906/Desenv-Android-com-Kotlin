package deeper

class Person(val name: String) {
    infix fun isName(value: String): Boolean {
        return value == name
    }
}

infix fun Int.isHalfOf(value: Int) = value / 2 == this

fun main(args: Array<String>) {

    println(10.isHalfOf(20))
    println(20 isHalfOf 30)

    val p1: Person = Person("Diego")
    println(p1 isName "Diego")
}