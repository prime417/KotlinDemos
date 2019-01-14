

fun main(args:Array<String>){

    var arrayList = ArrayList<String>()
    arrayList.add("ps")
    arrayList.add("qw")
    arrayList.add("er")
    arrayList.add("ty")

    println("First name: " + arrayList[0])

    //get method
    println("Second name: " + arrayList.get(1))

    // set method
    arrayList.set(0,"ps2")
    println("all element")

    for (index in arrayList){
        println(index)
    }

    println(" all element by index")
    for (index in 0..arrayList.size-1){
        println(arrayList[index])
    }

    // Search
    if (arrayList.contains("qw")){
        println("name is found")
    }
    else    {
        println("name not found")
    }

}