package app

import data.Person

fun main() {
    val togan = Person()
    togan.firstName = "Togan"
    togan.middleName = "Jagat"
    togan.lastName = "Raya"

    togan.sayHello("Budi")
    togan.run()
    togan.getFullname()

    val fullName = togan.getFullname()
    println(fullName)
}