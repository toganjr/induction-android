package app

import data.User

fun main() {

    val user1 = User("togan", "123")
    val user2 = User("jagat", "rahasia")

    user1.username = "budi"
    user2.password = "sangatrahasia"

    println(user1.username)
    println(user1.password)
    println(user2.username)
    println(user2.password)
}