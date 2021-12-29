package data

import java.util.*

//Extension Function
fun Date.print(): Unit = println("Pesanan dipesan pada tanggal $this")
fun String.print(): Unit = println("Jumlah Pesanan sebanyak $this")

 abstract class Order(val date: Date, val number: String) {

    abstract fun confirm()

    abstract fun close()
}