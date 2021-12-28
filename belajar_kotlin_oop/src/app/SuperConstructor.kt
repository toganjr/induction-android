package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Togan")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Jagat",999999999)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}