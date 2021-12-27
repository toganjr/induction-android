fun hello(firstName: String? , lastName: String? = null) {
    if (lastName != null) {
        println("Hello $firstName $lastName")
    } else {
        println("Hello $firstName")
    }
}

fun main() {
    hello("Togan", "Jagat")
    hello("Togan")
    hello("Togan", null)
}