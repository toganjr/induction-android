import com.sun.istack.internal.Nullable
//const  adalah variable yg global / dapat diakses dimana aja
const val APP = "Belajar Kotlin"
const val VERSION = "1.1"

fun main() {

    //variable = var ==> mutable
    //variable final = val ==> immutable

    //Tambah "?" agar bisa jadi nullable
    var firstName:String = "Togan"
    val lastName = "Jagat"
    println(firstName.length)

    var name: String?
    name = null
    println(name?.length)
    //name.length //Error karena bisa null

    println("$APP : $VERSION")


   // lastName = "Raya" error karena tidak bisa dirubah / immutable


}