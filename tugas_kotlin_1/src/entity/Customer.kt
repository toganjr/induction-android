package entity

import data.Order

class Customer(val name: String, val location: String) {

    fun sendOrder(order: Order){
        println("Pelanggan $name dengan lokasi $location telah memesan pesanan dengan jumlah ${order.number} pada tanggal ${order.date}")
    }

    fun receiveOrder(order: Order){
        println("Pelanggan $name dengan lokasi $location telah menerima pesanan dengan jumlah ${order.number} pada tanggal ${order.date}")
    }

}