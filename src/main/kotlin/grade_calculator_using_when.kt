fun main(){
    val marks = print("Enter Marks: ").let { readln().toInt() }

    when (marks){
        in 90..100  -> println("Your Grade is: A+")
        in 80..89  -> println("Your Grade is: A")
        in 70..79  -> println("Your Grade is: A-")
        in 60..69  -> println("Your Grade is: B")
        in 50..59  -> println("Your Grade is: C")
        in 40..49  -> println("Your Grade is: D")
        else -> println("Your Failed")
    }

}