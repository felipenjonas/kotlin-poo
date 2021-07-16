package collections.arrays.listas

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 6000.0

    salarios.forEach { println(it) }

//    Modificando um valor na posição X
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario + (salario * 0.5)
    }

    salarios.forEach { println(it) }

    val salarios2 = doubleArrayOf(1500.0,1300.0, 500.0)
    salarios2.forEach{println(it)}
}