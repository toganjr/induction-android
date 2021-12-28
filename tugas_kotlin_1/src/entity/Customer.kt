package entity

import data.Order

class Customer(val name: String, val location: String) {

    fun sendOrder(order: Order){
        // do Order
    }

    fun receiveOrder(order: Order){
        // get Order
    }

}