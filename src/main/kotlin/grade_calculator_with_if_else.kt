fun main() {
    val marks = print("Enter your marks: ").let { readln().toInt() }
    if (marks > 90)
        println("Your Grade is A+")
    else if (marks > 80)
        println("Your Grade is A")
    else if (marks > 70)
        println("Your Grade is A-")
    else if (marks > 60)
        println("Your Grade is B+")
    else if (marks > 50)
        println("Your Grade is B-")
    else if (marks > 40)
        println("Your Grade is C")
    else
        println("Your failed")


}
