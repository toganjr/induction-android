import data.NormalOrder
import data.SpecialOrder
import entity.Customer
import java.lang.System.currentTimeMillis
import java.time.LocalDate
import java.util.*

fun main() {
    val togan = Customer("togan", "Ngawi")
    val order1 = SpecialOrder(Date(currentTimeMillis()),"10")
    togan.sendOrder(order1)
    order1.confirm()
    order1.dispatch()
    togan.receiveOrder(order1)
    order1.close()

    val jagat = Customer("jagat", "Ngawi")
    val order2 = NormalOrder(Date(currentTimeMillis()),"5")
    jagat.sendOrder(order2)
    order2.confirm()
    order2.dispatch()
    jagat.receiveOrder(order2)
    order2.receive()
    order2.close()
}