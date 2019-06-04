package collections

fun main(args: Array<String>) {

    // List - array, set, Hashmap

    val l1 = listOf<String>("São Paulo", "Minas Gerais", "Paraná")
    val l2 = mutableListOf<String>("Goiás", "Bahia", "Rio de Janeiro")
    l2.add("Piauí")
    for (item in l2) {
        println("${l2.indexOf(item)} - $item")
    }

    println()

    // Permite alteração na estrutura
    val arr1 = arrayListOf<String>("Santa Catarina", "Rio Grande do Sul", "Pelotas")
    arr1.add("Amazonas")
    for (item in arr1) {
        println("${arr1.indexOf(item)} - $item")
    }

    println()

    // Não permite alteração na estrutura
    var s1 = setOf<String>("Espírito Santo", "Maranhão", "Tocantis", "Maranhão")

    // Permite alteração na estrutura, porém não permite valores repetidos
    var s2 = mutableSetOf<String>("Espírito Santo", "Maranhão", "Tocantis", "Maranhão")
    s2.add("Rondonia")

    println(s2.size)


    var h1 = hashMapOf<String, String>(Pair("key", "value"), Pair("key2", "value2"))

    var m1 = mapOf(Pair("key", "value"), Pair("key2", "value2"))
    var m2 = mutableMapOf(Pair("key", "value"), Pair("key2", "value2"))
    m2.put("key3","vakue3")
    for (item in m2) {
        println("$item")
    }


}
