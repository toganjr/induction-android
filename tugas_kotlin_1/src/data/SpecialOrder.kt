package data

import entity.Customer
import java.util.*

class SpecialOrder(date: Date, number: String ) : Order(date,number) {
    override fun confirm() {
        date.print()
        number.print()
    }

    override fun close() {
        println("Pengiriman pesanan Spesial telah selesai")
    }

    fun dispatch(){
        println("Pengiriman pesanan Spesial telah di tugaskan")
    }
}