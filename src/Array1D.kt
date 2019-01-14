

fun main(args: Array<String>){

    var arrayInt = Array<Int>(5){0}
    arrayInt[4] = 45
    arrayInt[2] = 21
    println("Array[5] = " + arrayInt[4])

    println("All element by object")
    for(element in arrayInt){
        println(element)
    }


    println("All element by index")
    for (index in 0..4){
        println(arrayInt[index])
    }

    println("Enter some String values")
    var arrayStr = Array<String>(4){""}

    for (index in 0..3){

        arrayStr[index] = readLine()!!

    }
    println("All String value")
    for (index in 0..3){

        println("arrayStr[ $index ] = " + arrayStr[index])
    }

}