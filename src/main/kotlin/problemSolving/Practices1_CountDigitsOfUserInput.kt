package problemSolving




//    Practices #01 - Wap to take input of numbers from user and count the digits of numbers.
//--------------------------// Method 1 //--------------------------//
fun countDigit(num: Int): Int {
    var count = 0
    var n = num
    while (n > 0) {
        count++
        n /= 10
    }
    return count
}

fun main() {
    val result = countDigit(2432200)
    println("Number of digits in 22 is $result")

//--------------------------// Method 2 //--------------------------//
    val userInput = print("Enter a number: ").let { readln() }
    println("User entered ${userInput.length} digit numbers. User entered number is: $userInput")

}


