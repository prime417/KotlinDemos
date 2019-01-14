
fun main (args :Array<String>){

    var map = HashMap<Int,String>()
    map.put(1,"ps")
    map.put(2,"we")
    map.put(3,"er")
    map.put(42,"rd")


    println(" Map for key 42 = " + map.get(42))
// if we use same key value then value will be change
    map.put(3,"fg")

    for (k in map.keys){

        println(map.get(k))
    }


}