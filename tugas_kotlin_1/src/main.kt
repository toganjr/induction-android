import data.NormalOrder
import data.Order
import data.SpecialOrder
import entity.Customer
import java.lang.System.currentTimeMillis
import java.time.LocalDate
import java.util.*

fun checkScopeRunCommand(){
    // runCommand() // ERROR KARENA BUKAN DALAM SCOPE
}

fun main() {

    checkScopeRunCommand()

    val togan = Customer("togan", "Ngawi")
    val specialOrder = SpecialOrder(Date(currentTimeMillis()),"10")
    val normalOrder = NormalOrder(Date(currentTimeMillis()),"5")

    // runCommand() //ERROR KARENA DIPANGGIL DIATAS FUNCTIONYA SENDIRI
    fun runCommand(customer: Customer, order: Order, type: (Customer, Order) -> Unit): Unit {
        println("==============================================================================================================================")
        type(customer,order)
        println("==============================================================================================================================")
    }

    val type: (Customer, Order) -> Unit = {
            customer: Customer, order: Order ->
        if (order is SpecialOrder) {
            customer.sendOrder(order)
            order.confirm()
            order.dispatch()
            customer.receiveOrder(order)
            order.close()
        } else if (order is NormalOrder){
            customer.sendOrder(order)
            order.confirm()
            order.dispatch()
            order.receive()
            customer.receiveOrder(order)
            order.close()
        }
    }

    runCommand(togan,normalOrder,type)

}
