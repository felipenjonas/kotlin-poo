package collections.arrays.listas

fun main() {
    val salarios = doubleArrayOf(1000.0,2000.0,4000.0)

//    Iterar
    for(salario in salarios){
        println(salario)
    }
    println("--------------------------------")
    println("Maior Salário: ${salarios.maxOrNull()}")
    println("Menor Salário: ${salarios.minOrNull()}")
    println("Média Salarial: ${salarios.average()}")

    println("Salários maiores que R$2500:")
    val salariosFilter = salarios.filter { it > 2500.0 }
    salariosFilter.forEach { println(it) }

    print("Quantos salários estão entre 2k e 4k:")
    println(salarios.count { it in 2000.0..4000.0 })

    println("Procurando salários específicos: ")
    println(salarios.find {it == 4000.0})
    println(salarios.find {it == 10000.0})

    println("Procurando qualquer salário válido: ")
    println(salarios.any {it == 4000.0})
    println(salarios.any {it == 10000.0})
}