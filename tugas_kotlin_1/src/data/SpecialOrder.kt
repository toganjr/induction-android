package data

import java.util.*

class SpecialOrder(date: Date, number: String ) : Order(date,number) {
    override fun confirm() {
        println("Pesanan Spesial dengan jumlah $number pada tanggal $date dikonfirmasi")
    }

    override fun close() {
        println("Pesanan Spesial dengan jumlah $number pada tanggal $date telah selesai")
    }

    fun dispatch(){
        println("Pesanan Spesial dengan jumlah $number pada tanggal $date telah di tugaskan")
    }
}