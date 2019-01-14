
fun main(args:Array<String>){

   // myFun1()

 loop@   for (count in 1..10){

        for (count2 in 1..5){
println("count: $count")
            if (count2==2){
                break@loop
            }
            println("count2: $count2")
        }
    }


}
fun myFun1(){

    for (count in 1..10){
        /*if (count !=4){
            println("count: $count")
        }*/

/*
        if (count == 4){
            continue
        }
        println("count: $count")
*/

        if (count == 4){
            break
        }
        println("count: $count")

    }


}