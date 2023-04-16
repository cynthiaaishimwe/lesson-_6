fun main() {
 val car = Car("volkswagen","sedan","blue",4)
    car.carry(3)
    car.identity()
    car.carry(6)
    println(car.calculateParkingFees(3))

    val bus = Bus("Mercedes", "Sprinter", "black", 30)

    bus.carry(25)
    bus.carry(35)
    bus.identity()
    println(bus.calculateParkingFees(3))
    println(bus.maxTripFare(10.0))




}

//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20

 open class Car(val make: String,val model: String,val color:String,val capacity:Int){

         fun carry(people: Int) {
             if (people <= capacity) {
                 println("Carrying $people passengers")
             } else {
                 val overCapacity = people - capacity
                 println("Over capacity by $overCapacity people")
             }
         }

         fun identity() {
             println("I am a $color $make $model")
         }

         open fun calculateParkingFees(hours: Int): Int {
             return hours * 20
         }
     }


//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus
 class Bus(make: String, model: String, color: String, capacity: Int) :  Car(make, model, color, capacity) {
    //
    fun maxTripFare(fare: Double): Double {
        return capacity * fare
    }

    override fun calculateParkingFees(hours: Int): Int {
        return hours * capacity * 20
    }
}



