package data

import java.util.*

 abstract class Order(val date: Date, val number: String) {

    abstract fun confirm()

    abstract fun close()
}