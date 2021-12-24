fun main() {

    //INI FOR LOOP

    //for each
    val names = arrayOf("Togan", "Jagat", "Raya")
    var total = 0
    for (name in names) {
        println(name)
        total++
    }

    println("Total perulangan sebanyak $total")

    //for data range
    for (value in 10..100 step 10){
        println(value)
    }

    val ukurangArray = names.size -1
    for ( i in 0..ukurangArray){
        println("index ke $i = ${names.get(i)}")
    }



}