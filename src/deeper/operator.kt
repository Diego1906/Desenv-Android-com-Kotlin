package deeper

data class Fraction(val numerator: Int, val denominator: Int) {
    operator fun plus(add: Fraction): Fraction {
        if (numerator == add.numerator) {
            return Fraction(numerator + add.numerator, denominator)
        } else {
            val common = denominator * add.denominator
            return Fraction(((common / denominator) * numerator) + ((common / add.denominator) * numerator), common)
        }
    }

    operator fun inc(): Fraction {
        return this
    }
}


fun main(args: Array<String>) {

    var f1: Fraction = Fraction(3, 2)
    val f2: Fraction = Fraction(5, 3)

    println(f1 + f2)
    f1++
}