class ParkingManager {

    var vehicles : MutableList<String> = mutableListOf("")
    var timeZone : Int = 0
    var time = 0
    var gheymatV = 0
    var gheymatKh = 0
    var car = Car()
    var bike = Bike()
    fun add(){

        println("Car or Bike : ")
        var vehicle = readLine()!!.toString()
        vehicles.add(vehicle)
        println("Time :")
        this.timeZone = readLine()!!.toInt()
    }
    fun remove(){

        println("type your id : ")
        var yourId = readLine()!!.toInt()
        if(vehicles[yourId-1]=="car"){

            gheymatV=car.entrancePrice()
            gheymatKh = car.hourPrice()
            gheymatKh = car.getCost(gheymatV , gheymatKh)
        }


        println("Time khoroj : ")
        this.time = readLine()!!.toInt()
        println("Your Id : $yourId" +
                "Your vehicle : ${vehicles[yourId-1]}" +
                "Time vorod : $timeZone" +
                "Time khoroj : $time" +
                "Time kol : $time - $timeZone" +
                "Gheymat : $gheymatKh")
        vehicles.removeAt(yourId - 1)
    }

}