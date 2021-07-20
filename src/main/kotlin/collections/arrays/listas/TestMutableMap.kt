package collections.arrays.listas

fun main() {
    val joao = Funcionario("João", 1000.0,"Tecnologia" )
    val maria = Funcionario("Maria", 4000.0, "Recursos Humanos")
    val carlos = Funcionario("Carlos", 2000.0, "Contabilidade")

    val repositorio = Repositorio<Funcionario>()

// POST
// Cadastro, sempre que cadastrar um novo funcionário aqui, nossa classe repositória irá instanciar no Mapa
    repositorio.create(id = joao.nome, value = joao )
    repositorio.create(id = maria.nome, value = maria )
    repositorio.create(id = carlos.nome, value = carlos )
// GET
//    println(repositorio.findById(id = joao.nome))
//    ou
    println("\nImprime findById:")
    println(repositorio.findById(maria.nome))
    println(repositorio.findById(joao.nome))

    println("\nImprime TODOS cadastrados:")
    repositorio.findAll().forEach {println(it)}

    println("\nExclui alguém:")
    repositorio.delete(maria.nome)
    repositorio.findAll().forEach { println(it)}


}