fun main() {
    print("Enter user1 name: ")
    val user1name = readln()
    print("Enter user1 age: ")
    val user1age = readln().toInt() // using .toInt for getting number from user


    //We can write this code in one line like below!!

    val user2Name = print("Enter user2 name: ").let { readln() }
    val user2Age = print("Enter user2 age: ").let { readln().toInt() }


    //we also can write this code like below

    val (user3Name, user3Age) = Pair(
        print("Enter user3 name: ").let { readln() },
        print("Enter user3 age: ").let { readln().toInt() }
    )

    println("___________________________________")

    println("User1 name is: $user1name \nUser1 age is: $user1age")
    println("User2 name is: $user2Name \nUser2 age is: $user2Age")
    println("User3 name is: $user3Name \nUser3 age is: $user3Age")


}