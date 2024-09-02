class Sum {
    constructor(a: Int, b: Int) {
        val result = a + b
        println("Sum: $result")
    }

    constructor(a: Int, b: Int, c: Int) {
        val result = a + b + c
        println("Sum: $result")
    }
}

fun main() {
    val sum = Sum(2, 3)
    // এখানে আমি sum এর Value তে শুধু a এবং b দিয়েছি ফলে ১ম Constructor call হয়েছে।  যদি a,b,c এর value দিতাম তাহলে ২য় constructor call হতো। যেমনঃ-
    val sum2 = Sum(2, 3, 5)


}