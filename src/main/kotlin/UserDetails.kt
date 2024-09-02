open class UserDetails(name: String, email: String, address: String, age: Int) {
    var userName = name
    var userEmail = email
    var userAddress = address
    var userAge = age

    init {
        require(name.isNotBlank()) { "Name cannot be blank" }
        require(email.isNotBlank() && email.contains("@")) { "Invalid email address" }
        require(age in 18..65) { "Age should be between 18 and 65" }
    }
    open fun displayDetails() {
        println("Name: $userName")
        println("Email: $userEmail")
        println("Address: $userAddress")
        println("Age: $userAge")
    }
}