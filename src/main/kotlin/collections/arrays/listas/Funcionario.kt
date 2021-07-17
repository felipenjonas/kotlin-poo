package collections.arrays.listas

data class Funcionario(
    val nome: String,
    val salario: Double,
    val setor: String
){
    override fun toString(): String =
        """
            
            Nome: $nome
            Salário: $salario
        """.trimIndent()
}