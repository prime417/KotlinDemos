
class Car1(){
    var type:String? = null
    var model:Int? = null

    var owner:String? = null
    constructor(type:String,model:Int):this(){
        this.type = type
        this.model = model
        println("Constructor1")
    }

    constructor(owner:String):this(){
        this.owner = owner
        println("Constructor2")
    }

    fun getCarModel():Int {
        return this.model!!
    }
}

fun main(args:Array<String>){

    val car1 = Car1("BMW",2014)

    println("Type getter: ${car1.type}  ${car1.model}" )

    car1.model = 2019

    println("Type setter: ${car1.type}  ${car1.model}" )
    val car2 = Car1("AUDI",2017)
//    println("car1: $car1")
val car3 = Car1("ps2")

    println("Const2 ${car3.owner}")
}