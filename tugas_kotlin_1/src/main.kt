import data.NormalOrder
import data.SpecialOrder
import entity.Customer
import java.time.LocalDate
import java.util.*

fun main() {
    val togan = Customer("togan", "Ngawi")
    val order1 = SpecialOrder(Date(2021-12-28),"10")
    togan.sendOrder(order1)
    order1.confirm()
    order1.dispatch()
    togan.receiveOrder(order1)
    order1.close()

    val jagat = Customer("jagat", "Ngawi")
    val order2 = NormalOrder(Date(2021-12-28),"10")
    togan.sendOrder(order2)
    order2.confirm()
    order2.dispatch()
    togan.receiveOrder(order2)
    order2.receive()
    order2.close()
}