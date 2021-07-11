package teste.digitalBank.tests


import teste.digitalBank.Cliente
import teste.digitalBank.ClienteTipo

fun main(){
    val userCliente = Cliente(
        nome = "Fábio",
        cpf = "123234",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(userCliente)
    AuthTest().signIn(userCliente)


}