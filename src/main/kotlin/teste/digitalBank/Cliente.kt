package teste.digitalBank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), AuthInterface {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome:     $nome
        Cpf:      $cpf
        Tipo:     ${clienteTipo.descricao}
    """.trimIndent()
}