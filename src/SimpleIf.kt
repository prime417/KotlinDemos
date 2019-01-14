
fun main(args:Array<String>){

    println("Enter your grade: ")

    var grade = readLine()!!.toDouble()

    if (grade >=90){

        println("You are in A level")
    }
else if (grade >=60 && grade<90 ){

    println("First class")
}else{
        println("Second Class")
    }
    println("you enter grade $grade")
}