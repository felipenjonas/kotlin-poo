package teste.digitalBank.tests

import teste.digitalBank.Gerente

fun main() {
    val carlos = Gerente("Carlos Roberto", "3434523899", 5000.0, "senha123")

    ImprimeRelatorioFuncionario.imprime(carlos)

    AuthTest().signIn(carlos)
}