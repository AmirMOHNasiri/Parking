open abstract class Vehicle {

    var id : Int =0
    constructor(){


    }
    private var entryHour =0
    fun getEntryHour(): Int {

        return entryHour
    }
    fun setEntryHour(entryHour : Int){

        this.entryHour = entryHour
    }

    private var exitHour = 0
    fun getExitHour(): Int{

        return exitHour
    }
    fun setExitHour(exitHour : Int){

        this.exitHour = exitHour
    }

    abstract fun entrancePrice() : Int
    abstract fun hourPrice() : Int
    fun getCost(vorodGH : Int , khorojGH : Int): Int {
        var price = 0
        price = vorodGH + khorojGH*(getExitHour() - getEntryHour())
        return price
    }

}