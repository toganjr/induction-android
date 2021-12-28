package data

import java.util.*

class SpecialOrder(date: Date, number: String ) : Order(date,number) {
    override fun confirm() {
        // do special confirm
    }

    override fun close() {
        // do special close
    }

    fun dispatch(){
        // do special dispatch
    }
}