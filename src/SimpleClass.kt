
class Car(var type:String, var model:Int){

//    init {
//        println("Type: $type")
//        println("Model: $model ")
//    }
// Use different name for methods
    fun getCarModel():Int {
        return this.model
    }
}

fun main(args:Array<String>){

val car1 = Car("BMW",2014)

    println("Type getter: ${car1.type}  ${car1.model}" )

    car1.model = 2019

    println("Type setter: ${car1.type}  ${car1.model}" )
val car2 = Car("AUDI",2017)
//    println("car1: $car1")

}