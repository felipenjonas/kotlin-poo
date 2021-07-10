package teste

class Pessoa {

    var nome: String = "Felipe"
    private set
    var cpf: String = "123"
    private set

    inner class Endereco {
        var rua: String = "R. Dr. Luiz"
    }

}