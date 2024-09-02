package problemSolving

fun isPrime(number: Int): Boolean {
    val isPrime = true
    for (i in 2..<number)
        if (number % i == 0)
            return !isPrime
    return isPrime
}


// This is optional. I converted the numbers to char for check every digit is prime or not.

//fun checkDigit(num: Int) {
//    val digits = num.toString()
//    for (char in digits) {
//        val digit = char - '0'
//        if (ProblemSolving.isPrime(digit))
//            println("$digit is a prime number!!")
//        else
//            println("$digit is not a prime number!!")
//
//    }
//}

fun main() {
    val num = 77
    val name = "AD JOY"

    if (isPrime(num))
        println("$num is a prime number")
    else println("$num is not a prime number")
}





