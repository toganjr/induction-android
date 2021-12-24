fun main() {
    val finalExam = 'E'
    when(finalExam) {
        'A' -> println("Mantap Djiwa")
        'B' -> {
            println("Mantap")
        }
        'C' -> println("Okay")
        'D' -> println("HMMMM")
        'E' -> println("Sakit Djiwa")
        else -> {
            println("Kayaknya salah input nilai deh")
        }
    }

    when(finalExam){
        'A','B','C' -> println("Selamat anda lulus")
        'D' -> println("Selamat anda belum lulus")
        'E' -> println("Selamat anda di DO")
        else -> println("Isi nilai yg bener dong")
    }

    //Pakai Array

    val passValues = arrayOf('A','B','C')
    when (finalExam) {
        in passValues -> println("Selamat anda lulus")
        !in passValues -> println("Selamat anda blm lulus")
    }

    val name = "Togan"
    when (name){
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    //When sebagai pengganti If Else
    val nilai = 70
    when {
        nilai > 80 -> println("Selamat Anda lulus")
        nilai > 60 -> println("Selamat Anda hampir tidak lulus")
        else -> println("Tetap menyerah dan jangan semangat")
    }
}