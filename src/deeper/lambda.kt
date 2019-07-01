package deeper

fun operator2(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    val ret = op(x, y)
    return ret
}

fun sum2(x: Int, y: Int) = x + y
fun multiply2(x: Int, y: Int): Int = x * y


fun main(args: Array<String>) {

    operator2(1, 2, ::sum2)
    operator2(1, 2, ::multiply2)

    println(operator2(20, 30, { a: Int, b: Int -> a + b }))
}