package collections.arrays.listas

fun main() {
    val joao = Funcionario("João", 1000.0)
    val maria = Funcionario("Maria", 4000.0)
    val carlos = Funcionario("Carlos", 2000.0)

    val colaboradores = listOf(joao,maria, carlos)

//    Mostra cada um do funcionários em suas posições no Array
    colaboradores.forEach { println(it)}
//    Procura e printa Somente igual Carlos
    println(colaboradores.find { it.nome == "Maria" })
}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            
            Nome: $nome
            Salário: $salario
        """.trimIndent()
}