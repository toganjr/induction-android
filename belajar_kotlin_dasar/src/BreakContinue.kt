fun main() {

    //Break menghentikan perulangan
    //Continue Menghentikan perulangan yg saat itu sedang berjalan dan melanjutkan ke next

    //Break
    var i = 0
    while (true) {
        println("perulangan ke ${i+1}")
        i++
        if (i >= 10) {
            break;
        }
    }

    //continue untuk ngeprint bilangan ganjil
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }
}