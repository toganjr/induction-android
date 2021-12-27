package app

import data.Manager
import data.VicePresident

fun main() {

    val manager= Manager("Togan")
    manager.sayHello("Budi")

    val vicePresident = VicePresident("Jagat")
    vicePresident.sayHello("Eko")

}