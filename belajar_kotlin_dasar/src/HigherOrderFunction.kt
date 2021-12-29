fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }


    val lambdaUpper= {value: String -> value.uppercase()}
    println(hello("Togan", lambdaUpper))
    println(hello("Togan", {value: String -> value.lowercase()}))

    val result1= hello("Togan", {value: String -> value.lowercase()})
    //Menggunakan trailing lambda
    val result2 = hello("Togan"){ value: String ->
        value.lowercase()
    }


}