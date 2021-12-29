fun main() {

//Jika lebih dari 1
    val contohLambda: (String, Int) -> String = {
        firstName: String, absen: Int ->
        val result = "$firstName has absen for $absen times"
        result
    }

    val result = contohLambda("Togan",0)
    println(result)

//Jika 1 maka bisa ganti it
    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Togan"))

//Method References menggunakan function yg ada untuk lambda
    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Togan Jagat"))

}

fun toUpper(value: String): String = value.uppercase()