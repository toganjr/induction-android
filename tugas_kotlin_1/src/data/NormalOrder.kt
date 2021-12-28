package data

import java.util.*

class NormalOrder(date: Date, number: String) : Order(date, number) {

    override fun confirm() {
        println("Pesanan dengan jumlah $number pada tanggal $date dikonfirmasi")
    }

    override fun close() {
        println("Pesanan dengan jumlah $number pada tanggal $date telah selesai")
    }

    fun dispatch() {
        println("Pesanan dengan jumlah $number pada tanggal $date telah di tugaskan")
    }

    fun receive() {
        println("Pesanan dengan jumlah $number pada tanggal $date diterima")
    }

}