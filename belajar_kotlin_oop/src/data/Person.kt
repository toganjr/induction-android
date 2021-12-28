package data

class Person {

    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String) {
        println("Hello $name, My Name is $firstName")
    }

    fun sayHello(name: Int) {
        println("Hello $name, My Name is $firstName")
    }

    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, My Name is ${this.firstName}")
    }

    fun run(){
        println("I'm Running")
    }

    fun getFullname(): String {
        return "$firstName $middleName $lastName"
    }

}

