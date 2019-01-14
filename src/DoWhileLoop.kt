
fun main (args:Array<String>){

    var count = 1


    do {
        if (count ==2){
            println("count: $count")
        }else{
            println(" else count: $count")
        }

        count++
    } while(count < 5)


    println("loop done")
}