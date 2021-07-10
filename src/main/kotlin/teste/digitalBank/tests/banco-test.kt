package teste.digitalBank.tests

import teste.digitalBank.Bank

fun main(){
    val banco = Bank(name = "Jonas BanK", number = 1)
    println(banco.name)
    println(banco.number)

//    Alterando variáveis através de uma cópia:
//    val bankCopy = banco.copy(name = "Novais BanK")

}
