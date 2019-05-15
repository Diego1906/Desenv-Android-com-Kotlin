package basic

import java.lang.Exception
import java.lang.NullPointerException

fun main(args: Array<String>) {

    try {
        var number = "sdkgb".toInt()
    } catch (e: NullPointerException) {
        println("NULL POINTER")
    } catch (e: NumberFormatException) {
        println("Não é um número")
    } catch (e: Exception) {
        println("Não sei o que aconteceu!")
    }finally {
        println("Finalmente")
    }
}