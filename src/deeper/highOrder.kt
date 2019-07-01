package deeper

fun operator(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    val ret = op(x, y)
    return ret
}

fun sum(x: Int, y: Int) = x + y

fun multiply(x: Int, y: Int): Int = x * y

fun <T> Iterable<T>.paraCada(op: (T) -> Unit) {
    for (i in this) {
        op(i)
    }
}

fun main(args: Array<String>) {

    val list = listOf(1, 2, 3, 4)
    list.forEach({ println(it) })
    list.paraCada({ println(it) })

    val strList = listOf("", "", "", "")
    strList.paraCada({ println(it) })

    val map = mapOf(Pair("Paris", "França"))
    map.values.paraCada({ println(it) })

    operator(1, 2, ::sum)
    operator(1, 2, ::multiply)
}