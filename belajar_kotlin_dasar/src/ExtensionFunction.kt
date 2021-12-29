fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {

    val name = "Togan"
    val name2 = "Jagat"

    println(name.hello())

    name2.printHello()

}