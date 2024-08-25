fun isPrime(number:Int):Boolean{
    if (number <= 1) return false
    for( i in 2 .. number){
        if (number%i == 0) return false
    }
    return true
}

fun checkDigit(num:Int){
    val digits = num.toString()
    for (char in digits){
        val digit = char.toString().toInt()
    }
}

fun main() {
    val userInput = 7
    if (isPrime(userInput)){
        println("$userInput is a prime number!")
    } else
        println("$userInput is not a prime number!")

}





