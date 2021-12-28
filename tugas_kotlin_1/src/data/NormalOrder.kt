package data

import java.util.*

class NormalOrder(date: Date, number: String) : Order(date, number) {

    override fun confirm() {
        //do normal confirm
    }

    override fun close() {
        //do normal close
    }

    fun dispatch(){
        // do normal dispatch
    }

    fun receive(){
        // do special receive
    }

}