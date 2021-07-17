package collections.arrays.listas

fun main() {
    val joao = Funcionario("João", 1000.0,"Tecnologia" )
    val maria = Funcionario("Maria", 4000.0, "Recursos Humanos")
    val carlos = Funcionario("Carlos", 2000.0, "Contabilidade")
    val andre = Funcionario("André", 4000.0, "Contabilidade")

    val colaboradores = listOf(joao,maria, carlos,andre)

//    Mostra cada um do funcionários em suas posições no Array
    colaboradores.forEach { println(it)}
//    Procura e printa Somente igual Carlos
    println(colaboradores.find { it.nome == "Maria" })
//Usando o sortedBy encadeado
    println("\n------- Usando o sortedBy salario: ")
    colaboradores
        .sortedBy { it.salario }
        .forEach { println(it) }
// Usando o GroupBy por setor
    println("\n------- Usando o groupBy por setor: ")
    colaboradores
        .groupBy { it.setor }
        .forEach { println(it) }


}
