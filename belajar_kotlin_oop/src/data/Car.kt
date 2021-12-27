package data

class Car(paramBrand: String, paramName: String, paramYear: Int = 2020){

    init {
        println("Car $paramBrand dibuat")
    }

    constructor(paramBrand: String, paramName: String) : this(paramBrand,paramName,2020) {
        println("Seconday Constructor 1")
    }

    constructor(paramBrand: String) : this(paramBrand, ""){
        println("Secondary Constructor 2")
    }


    var brand: String = paramBrand
    var year: Int = paramYear

}