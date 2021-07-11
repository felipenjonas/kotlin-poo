package teste.digitalBank.tests

import teste.digitalBank.AuthInterface

class AuthTest {
    fun signIn(auth: AuthInterface) = println(auth.login())
}