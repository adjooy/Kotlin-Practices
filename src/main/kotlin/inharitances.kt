// **Parent Class**
// The `open` keyword allows this class to be inherited by other classes.
// In Kotlin, classes are `final` by default, meaning they cannot be inherited unless marked with `open`.
open class ClassA {
    val name: String = "BrigitteXia" // Property of ClassA
    val number: Int = 534 // Another property of ClassA

    // Method to find the cube of a number
    // Marked as `open` so it can be overridden by a child class
    open fun cubeFinder(number: Int): Int {
        return number * number * number // Returns the cube of the input number
    }
}

// **Child Class**
// `ClassB` inherits from `ClassA` using the colon `:` syntax.
// This means `ClassB` gets all properties and methods from `ClassA`.
class ClassB : ClassA() {
    // If we want to change a method from the parent class, we use `override`.
    // The method in the parent class must be marked with `open`.
    override fun cubeFinder(number: Int): Int {
        return number * number // Now this returns the square instead of the cube
    }
}

fun main() {
    val classB = ClassB() // Create an instance of ClassB
    println(classB.name) // Access inherited `name` property, Output: BrigitteXia
    println(classB.number) // Access inherited `number` property, Output: 534
    println(classB.cubeFinder(10)) // Calls overridden method, Output: 100 (square of 10)
}
