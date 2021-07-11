package teste.digitalBank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double,
) : Pessoa(nome, cpf)  {
//    protected = classe funcionário e filhas podem usar este membro.
//    Sempre indique o tipo de dado retornado.
    protected abstract fun calculoAuxilio(): Double

//    Kotlin Resource...
    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Salario: $salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()
}