package collections

import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>) {

    val data = listOf(
        Food(
            "Lasanha", 1200.0,
            listOf(
                Ingredients("Farinha", 1),
                Ingredients("Presunto", 5),
                Ingredients("Queijo", 10),
                Ingredients("Molho de Tomate", 2),
                Ingredients("Manjerição", 3)
            )
        ),
        Food("Panqueca", 500.0),
        Food("Omelete", 200.0),
        Food("Parmegiana", 700.0),
        Food("Sopa de feijão", 300.0),
        Food(
            "Hamburger", 2000.0,
            listOf(
                Ingredients("Pão", 1),
                Ingredients("Hamburger", 3),
                Ingredients("Queijo", 1),
                Ingredients("Catupiry", 1),
                Ingredients("Bacon", 3),
                Ingredients("Alface", 1),
                Ingredients("Tomate", 1)
            )
        )
    )

    // Sei como fazer panqueca? E Sushi?
    val knowPancake = data.filter { it.name == "Panqueca" }.any()
    println("Sei fazer panqueca? ${if (knowPancake) "sim" else "não"}")

    val knowSushi = data.filter { it.name == "Sushi" }.any()
    println("Sei fazer sushi ? ${if (knowSushi) "sim" else "não"}")

    // Quais são as comidas com mais de 500 calorias
    val moreCalories = data.filter { it.calories > 500 }.forEach { println(it.name) }

    // Par( chave, valor) de comidas com mais de 500 calorias (nome, calorias)
    data.filter { it.calories > 500 }
        .map { Pair(it.name, it.calories) }
        .forEach { println("${it.first}: ${it.second}") }

    println()
    // Quais das receitas possui farinha como ingredientes
    data.filter { it.ingredientes.any { it.name == "Farinha" } }.forEach { println(it.name) }

    println()
    data.filter { hasIngridients(it.ingredientes, "Tomate") }.forEach { println(it.name) }

}

fun hasIngridients(list: List<Ingredients>, name: String): Boolean {
    return list.filter { it.name == name }.any()
}
