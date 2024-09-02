fun main() {
    // Lambda for squaring a number
    val square = { x: Int -> x * x }

    // Lambda for generating a multiplication table
    val multiplicationTable = { x: Int ->
        for (i in 1..10) {
            println("$x x $i = ${x * i}")
        }
    }

    // Prompt user for input
    print("Enter a number for multiplication table: ")
    val mpTable = readln().toInt()

    // Generate and print the multiplication table
    multiplicationTable(mpTable)
}
