package collections.arrays.listas

class Repositorio<T> {
//    mutableMapOf<"Chave" tipo string, "valor" usando a letra T (padrão)>
//    T = generics, valor do objeto
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T) {
//        map.put(id, value) método padrão de trabalçhar com o map
//        Segundo modo: Map na chave e retorna diretamente o valor
        map[id] = value
    }

    fun delete(id:String) = map.remove(id)

//    Retorna o valor em tal chave
//    - Dado uma chave (id) é retornado um valor.
    fun findById(id: String) = map.get(id)

//    Retorna todos os valores instanciados
    fun findAll() = map.values
}