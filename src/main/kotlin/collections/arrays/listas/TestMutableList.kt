package collections.arrays.listas

fun main() {
    val joao = Funcionario("João", 1000.0,"Tecnologia" )
    val maria = Funcionario("Maria", 4000.0, "Recursos Humanos")
    val carlos = Funcionario("Carlos", 2000.0, "Contabilidade")
    val andre = Funcionario("André", 4000.0, "Contabilidade")

    val marcelo = Funcionario("Marcelo", 3500.0,"Compras")

//    MutableList
    val colaboradores = mutableListOf(joao,maria, carlos,andre)

//    Adicionando novo colaborador:
    colaboradores.add(marcelo)

//    Removendo carlos
    colaboradores.remove(carlos)

//    MutableSet
    val colaboradoresSet = mutableSetOf(joao)
//Somente joao
    colaboradoresSet.forEach { println(it)}
//    Adicionando mais 2 ao MutableSet
    colaboradoresSet.add(maria)
    colaboradoresSet.add(carlos)
    colaboradoresSet.forEach { println(it)}
// Remove Set
    colaboradoresSet.remove(carlos)
    colaboradoresSet.forEach { println(it)}
}
