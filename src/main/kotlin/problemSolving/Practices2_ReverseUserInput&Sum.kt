package problemSolving
//Practices #02 - WAP for get a number from user and reversed it & sum with 5 before and after reversed
//--------------------------// Method 1 //--------------------------//

fun reverseNum(number: Int): Int{
    var a = number
    var reversed = 0
    while(a!=0){
        val digit = a%10
        reversed = reversed * 10 + digit
        a /= 10
    }
    return reversed
}

//--------------------------// Method 2 //--------------------------//

fun main() {
    // Methods 1 called
    val method1 = reverseNum(2345)
    println(method1)

    // Methods 2
    val userInput2 = print("Enter Number: ").let { readln().toInt() }
    println("added 5 before reversed: ${userInput2 + 5}")
    println("Reversed the user inputted number:${userInput2.toString().reversed()} ")
    println("Added 5 after reversed: ${userInput2.toString().reversed().toInt() + 5}")

    



}
