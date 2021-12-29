package entity

import data.Order
import data.SpecialOrder

class Customer(val name: String, val location: String) {

    fun sendOrder(order: Order): Unit{
        val name = this.name.uppercase()
        val location = this.location.uppercase()
       if (order is SpecialOrder) {
           return println("Pelanggan $name dengan lokasi $location telah melakukan pemesanan Special")
       } else {
           return println("Pelanggan $name dengan lokasi $location telah melakukan pemesanan")
       }
    }

    fun receiveOrder(order: Order): Unit{
        val name = this.name.uppercase()
        val location = this.location.uppercase()
       return println("Pelanggan $name dengan lokasi $location telah menerima pesanan dengan jumlah ${order.number} pada tanggal ${order.date}")
    }

}