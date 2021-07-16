package collections.arrays.listas

fun main() {
//    IntArray precisa receber um tamanho, em seu argumento
    var values = IntArray(5)

    values[0] = 1
    values[1] = 2
    values[2] = 7
    values[3] = 10
    values[4] = 9

    for (valor in values) {
        println(valor)
    }
    print("\n")

    values.forEach {
//        it = valor

        println(it)
    }

    print("\n")

    for (index in values.indices) {
        println(values[index])
    }

    print("\n")

//    sort, ordena por padrão de forma crescente.
    values.sort()
    for (valor in values) {
        println(valor)
    }


}