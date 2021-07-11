package teste.digitalBank.tests

import teste.digitalBank.Analista

fun main() {
    val joao = Analista("João Pedro", "1234567899", 2000.0)

    ImprimeRelatorioFuncionario.imprime(joao)
}