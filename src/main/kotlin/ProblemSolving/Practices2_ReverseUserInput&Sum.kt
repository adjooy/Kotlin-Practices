package Practices

fun main() {
    //Practices #02 - WAP for get a number from user and reversed it & sum with 5 before and after reversed
    val userInput2 = print("Enter Number: ").let { readln().toInt() }
    println("added 5 before reversed: ${userInput2 + 5}")
    println("Reversed the user inputted number:${userInput2.toString().reversed()} ")
    println("Added 5 after reversed: ${userInput2.toString().reversed().toInt() + 5}")
}
