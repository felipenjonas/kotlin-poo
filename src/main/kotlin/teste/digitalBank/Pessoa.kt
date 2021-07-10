package teste.digitalBank

class Pessoa {
    var nome: String = "Felipe"
    var cpf: String = "123"
    private set

    inner class Endereco {
        var rua: String = "R. Dr. Luiz"
    }

}