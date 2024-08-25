fun main() {
    //Practices #03 - WAP to take number from user and find the sum of cube of each digit
    print("Enter a number: ")
    val userInput3 = readlnOrNull()?.toIntOrNull()
    if (userInput3 != null) {
        var sum = 0
        var tempNumber = userInput3
        while (tempNumber != 0) {
            val digit = tempNumber % 10
            val cube = digit * digit * digit
            sum += cube
            println("The cube of $digit is: $cube") // Print each digit
            tempNumber /= 10
        }
        println("The sum of cubes of each digit is: $sum")
    } else {
        println("Your input is not a number!")
    }
}


// 2nd Method
//fun main() {
//    val string = "245"
//    for (char in string) {
//        val digit = char - '0'
//        val cube = digit*digit*digit
//        println(digit) // Prints: 1 and 0, not 10
//        println("The cube of $digit is: $cube")
//    }
//}