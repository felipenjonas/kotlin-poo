package teste.digitalBank.tests

import teste.digitalBank.Funcionario

class ImprimeRelatorioFuncionario {
//    Companion object = instancia um objeto dentro da classe. Assim, basta usar a fun diretamente qunado for chamada
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}