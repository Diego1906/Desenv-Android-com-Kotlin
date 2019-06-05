package collections

data class Food(val name: String, val calories: Double, val ingredientes: List<Ingredients> = listOf())

data class Ingredients(val name: String, val quantity: Int)