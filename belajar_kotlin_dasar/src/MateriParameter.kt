//Helimeter Helimeter, Parameter Parameter

fun sayHello(firstName: String?, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    sayHello("Togan",null)
    sayHello("Togan", "Jagat")
}