package data

import java.util.*

class NormalOrder(date: Date, number: String) : Order(date, number) {

    override fun confirm() {
        date.print()
        number.print()
    }

    override fun close() {
        println("Pengiriman pesanan telah selesai")
    }

    fun dispatch() {
        println("Pengiriman pesanan telah di tugaskan")
    }

    fun receive() {
        println("Pesanan telah diterima oleh pelanggan")
    }

}