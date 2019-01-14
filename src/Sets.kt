
fun main(args:Array<String>){
    var setNet = setOf(1,2,3,4,5)
//    setNet.add(2) is immutable

    println("Immutable list")
    for (index in setNet){

        println(index)
    }
    var setNetM = mutableSetOf(1,2,3,4,5)
//    setNet.add(2) is immutable

    println("Mutable list")
    setNetM.add(45)
    for (index in setNetM){

        println(index)
    }
}