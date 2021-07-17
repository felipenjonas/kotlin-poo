package collections.arrays.listas

fun main() {
// Opção 1: Conjunto de Pair = um mapa de chave e valor. Json!
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map = mapOf(pair)

    map.forEach { (key, value) ->
        println("""
            "Chave:" $key
            "Valor": $value
            
            """.trimIndent())
    }
//Opção 2: Altera a sintaxe do Pair, basta usar o "to" no argumento.

    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Mario" to 1500.0,
        "Willian" to 3500.0
    )
//    println(map2) OU ->
    println("Segunda opção:\n")
    map2.forEach { (key, value) ->
        println("""
            Chave: $key
            Valor: $value
            
            """.trimIndent())
    }

}