fun main() {

    var firstName: String = "Togan"
    var lastName: String = "Jagat"
    var address: String = """
        Jalan Ngawi-Caruban 
        RT 09/ RW 06
        Kabupaten Ngawi
    """.trimIndent()
    var address2: String = """
        |Jalan Ngawi-Caruban 
        |RT 09/ RW 06
        |Kabupaten Ngawi
    """.trimMargin()

    println(firstName)
    println(lastName)
    println(address)
    println(address2)

    var fullname: String = firstName +" "+ lastName
    println(fullname)

    var newfullname:String = "$firstName $lastName"
    var desc: String = "$newfullname length = ${fullname.length}"
    println(desc)

}