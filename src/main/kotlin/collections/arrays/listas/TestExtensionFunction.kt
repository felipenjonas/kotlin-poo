package collections.arrays.listas

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
        )

    println("\nSomar: " + salarios.somar())
    println("\nMédia: " + salarios.media())
}