import data.NormalOrder
import data.Order
import data.SpecialOrder
import entity.Customer
import java.lang.System.currentTimeMillis
import java.time.LocalDate
import java.util.*

fun main() {

    val specialOrder = SpecialOrder(Date(currentTimeMillis()),"10")
    val normalOrder = NormalOrder(Date(currentTimeMillis()),"5")

    val doSomething: (Order) -> Unit = {
        if (it is SpecialOrder) {
            it.confirm()
            it.dispatch()
            it.close()
        } else if (it is NormalOrder){
            it.confirm()
            it.dispatch()
            it.receive()
            it.close()
        }
    }

    val togan = Customer("Raya", "Ngawi").let {
        it.doOrder(specialOrder,doSomething)
    }

}
