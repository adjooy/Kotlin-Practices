fun main(){
    val marks = print("Enter your marks: ").let { readln().toInt() }
    if (marks in 90..100)
         println("Your Grade is A+")
    else if (marks in 80..89)
        println("Your Grade is A")
    else if (marks in 70..79)
        println("Your Grade is A-")
    else if (marks in 60..69)
        println("Your Grade is B+")
    else if (marks in 50..59)
        println("Your Grade is B-")
    else if (marks in 40..49)
        println("Your Grade is C")
    else
        println("Your failed")



}
