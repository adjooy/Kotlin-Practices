fun main(){


    //    val marks = print("Enter Marks: ").let { readln().toInt() }
// when (marks){
//        in 90..100  -> println("Your Grade is: A+")
//        in 80..89  -> println("Your Grade is: A")
//        in 70..79  -> println("Your Grade is: A-")
//        in 60..69  -> println("Your Grade is: B")
//        in 50..59  -> println("Your Grade is: C")
//        in 40..49  -> println("Your Grade is: D")
//        else -> println("Your Failed")
//    }

    // We can store the grade in a variables and use it later like below!!
    val marks = print("Enter Marks: ").let { readln().toInt() }
    val grade = when (marks) {
        in 90..100 -> "Your Grade is: A+"
        in 80..89 -> "Your Grade is: A"
        in 70..79 -> "Your Grade is: A-"
        in 60..69 -> "Your Grade is: B"
        in 50..59 -> "Your Grade is: C"
        in 40..49 -> "Your Grade is: D"
        else -> "Your Failed"
    }
    println(grade)





}