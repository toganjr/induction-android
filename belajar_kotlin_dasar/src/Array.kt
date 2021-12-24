fun main() {

    val members: Array<String> = arrayOf("Togan", "Jagat", "Raya")
    val values: Array<Byte> = arrayOf(12,10,20)
    val balances: Array<Int> = arrayOf(10_000,20_000,50_000)

    println(members[0])
    members[0] = "Nagot"
    println(members[0])

    val nilai:Array<Int> = arrayOf(10,9,8)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    //Membuat array null
    val nama : Array<String?> = arrayOfNulls(5)
    nama[0] = "Togan"
    nama[1] = "Togan"
    nama[2] = "Togan"
    nama[3] = "Togan"
    println(nama[0])
    println(nama[1])
    println(nama[2])
    println(nama[3])
    println(nama[4])

    println(balances)
}