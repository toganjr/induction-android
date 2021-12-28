package app

import data.Person

fun main() {
    val togan = Person()
    val jagat = Person()
    val raya = Person()

    togan.firstName = "Togan"
    jagat.firstName = "Jagat"
    raya.firstName = "Raya"

    println(togan.firstName)
    println(jagat.firstName)
    println(raya.firstName)
}