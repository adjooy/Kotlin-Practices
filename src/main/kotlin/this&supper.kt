    open class Car{
        //Basic car properties
        fun startEngine(): String{
            return  "Engine started"
        }
        open fun accelerate(): String{
            return "Car accelerating"
        }
        fun stopEngine(): String{
            return "Engine stopped"
        }
    }

    class SportsCar : Car(){
        init{
            //We can access the parent class properties directly with the help of super keywords like below:
            println("Start Button Pressed: " + super.startEngine())
            println("Accelerator Pressed: " + super.accelerate())
            println("Break Pressed: " + super.stopEngine())
        }

        // "this" keyword example
        var carNumber = 212121
        fun carDetails(carNumber: Int): String {
            val carNum1 =  "Car Number: $carNumber"

            //if we call the carDetails function then it will return  the car number that will declare in main function not in this function.

            // Output: Car Number: 5522
            //But if we use 'This' keyword then the output will be car number that is declared in carNumber variable.like:
            val carNum2 = "Car Number: ${this.carNumber}"
            return "This is without this keyword: $carNum1\n" +
                    "This is with this keyword: $carNum2"

        }


    }

    fun main() {
        val car = SportsCar()
        println(car.carDetails(5522)) // Output: Car Number: 5522

    }