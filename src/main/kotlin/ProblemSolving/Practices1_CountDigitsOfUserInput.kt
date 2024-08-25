package Practices//    Practices #01 - Wap to take input of numbers from user and count the digits of numbers.

fun main() {
    val userInput = print("Enter a number: ").let { readln() }
    println("User entered ${userInput.length} digit numbers. User entered number is: $userInput")



}
