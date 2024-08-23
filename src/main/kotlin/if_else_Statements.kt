fun main() {

    //If & else Condition -->
    println("Welcome to Guess Game!!")
    print("Guess a number between 10 to 20: ")
    val guessNumber = readln().toInt()
    val winingNumber = 11
    if (guessNumber == winingNumber)
        println("Congratulation!! You WIN!")
    else if (guessNumber > 20)
        println("Sorry, You Loss!!\nYour number is too big. Try smaller number!!")
    else if (guessNumber < 10)
        println("Sorry, You Loss!!\nYour number is too small. Try bigger number!!")
    else
        println("Sorry, You Lose!!\nYour number is between 10 and 20 but not the winning number. Try again!")


}