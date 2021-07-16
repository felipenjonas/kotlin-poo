package collections.arrays.listas

fun main(){
    val values = intArrayOf(1,10,3,4,5)


    println("#### Sem ordenação:")
    values.forEach{println(it)}

    println("\n#### Com ordenação:")
    values.sort()
    values.forEach { println(it) }

}