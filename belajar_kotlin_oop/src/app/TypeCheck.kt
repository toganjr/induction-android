package app

import data.HandPhone
import data.Laptop

fun printObject(any: Any) {
    if (any is Laptop) {
        println("ini Laptop ${any.name}")
    } else if (any is HandPhone) {
        print("ini Handphone ")
        println(any.name)
    } else {
        println(any)
    }
    //println(any)
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("ini Laptop ${any.name}")
        is HandPhone -> println("ini Handphone ${any.name}")
        else -> println(any)
    }
}

//Unsafe Cast
fun printStringNotSafe(any: Any) {
    val value = any as String
    println(value)
}

fun printStringSafe(any: Any) {
    val value = any as? String
    println(value)
}

fun main() {
//    printObject("Eko")
//    printObject(1)
//    printObject(Laptop("Acer"))
//    printObject(HandPhone("Samsung"))

    printStringNotSafe("Eko")
    printStringSafe("Eko")
    printStringSafe(1)
    // printString(1) //Eror cannot be cast to string

    printObjectWithWhen("Eko")
    printObjectWithWhen(1)
    printObjectWithWhen(Laptop("Acer"))
    printObjectWithWhen(HandPhone("Samsung"))
}