

fun main(args:Array<String>){

    var map = hashMapOf(1 to "as", 2 to "gd")
    map.put(3,"er")
println(map.get(3))
    println(map[2])

    var ar = arrayOf(2,3,1,55)

    println(ar[0])

    var list = listOf(21,24,34)
   // list[2] = 2 not applicable

    println("Mutable list")
    var muList = mutableListOf(45,65,442)
    muList[2] = 12

    for (item in muList){
        println(item)
    }
}