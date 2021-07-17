package collections.arrays.listas

fun main() {
    val joao = Funcionario("João", 1000.0,"Tecnologia" )
    val maria = Funcionario("Maria", 4000.0, "Recursos Humanos")
    val carlos = Funcionario("Carlos", 2000.0, "Contabilidade")
    val andre = Funcionario("André", 4000.0, "Contabilidade")

    val colaboradores = setOf(joao,maria)
    val colaboradoresContabilidade = setOf(carlos,andre)

//    Fazendo a junção dos 2 conjuntos.
    val allColaboradores = colaboradores.union(colaboradoresContabilidade)
    allColaboradores.forEach { println(it) }

/*  Fazendo a substração do conjunto
    o método subtract retira o que tem no conjunto A que é igual ao conjunto B
    No exemplo abaixo, joao foi removido de allColaboradores, pois ele é parte do conjunto colaboradoresTI
    Então, mostrou na tela, allColaboradores mas sem o joao
*/
    println("\n Subtract de allColaboradores")

    val colaboradoresTI = setOf(joao)
    val resultado = allColaboradores.subtract(colaboradoresTI)
    resultado.forEach{ println(it) }

//    Intersect = interseção (o que tem em comum entre A e B)
    println("\n Intersect de allColaboradores")
    val resultadoIntersect = allColaboradores.intersect(colaboradoresTI)
    resultadoIntersect.forEach{ println(it) }
}