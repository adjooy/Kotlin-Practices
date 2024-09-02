class Addition {
    var number = 20

    // Companion Object
    companion object {
        var num = 10

        fun callMe() = println("This method is called")
        fun sum(a: Int, b: Int){
           println("Sum is: ${a+b}")
        }

    }
}

fun main() {
    // Accessing companion object properties and methods
    //We don't need to create a object for call companion object properties
    println(Addition.num)      // Output: 10
    Addition.callMe()         // Output: This method is called
    Addition.sum(2,3)



    // Accessing instance property
    println(Addition().number) // Output: 20
}
