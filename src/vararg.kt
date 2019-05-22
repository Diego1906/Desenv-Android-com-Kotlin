fun media3(vararg notas: Float): Float {
    var soma: Float = 0.0f
    if (notas.isNotEmpty()) {
        for (nota in notas) {
            soma += nota
        }
    }
    return soma / notas.size
}

fun <T> media(vararg valores: T) {
    for (valor in valores) {
        println(valor)
    }
}

fun main() {
    val media = media3(1f, 3f, 4.5f, 8.9f, 5.7f)
    println("A média do aluno é $media")

    media(1, 4f, "", false, "", 'C')
}
