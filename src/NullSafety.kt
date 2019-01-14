

fun main(args : Array<String>){

    var name:String?

    name = null
// variable can have null except we explicit declare !!
    println("Name: " + name)
// if we declare !! then a variable must have a value
    println("2 Name: " + name!!)
}