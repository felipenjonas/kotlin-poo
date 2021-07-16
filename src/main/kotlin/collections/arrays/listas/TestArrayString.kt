package collections.arrays.listas

fun main() {

/* val nome = Array<String>(10) {""} - Iniciando vazio, por padrão precisa de um size e uma inicialização
    Dessa forma, se passar o inicializador com string não precisa especificar o tipo do Array. Veja abaixo:

*/
    val nomes = Array(3) {""}
    nomes[0] = "Ana"
    nomes[1] = "Maria"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    println("\n#### Com ordenação:")
    nomes.sort()
    nomes.forEach { println(it) }

//    Usando ArrayOf
    println("\n#### Com ordenação em ArrayOf :")
    val lastNames = arrayOf("Souza", "Silva", "Altalira")
    lastNames.sort()
    lastNames.forEach {println(it)}

}
