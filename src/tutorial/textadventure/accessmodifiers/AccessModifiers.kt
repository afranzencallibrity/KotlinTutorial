package tutorial.textadventure.accessmodifiers
val MY_CONSTANT = 100 // defining a constant

/**
 * Created by afranzen on 1/23/18.
 */

fun main(args: Array<String>) {

    println(MY_CONSTANT)

    val emp = Employee("John")
    println(emp.firstName)
    emp.fullTime = false
    println(emp.fullTime)

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee("Jane", false)
    println(emp3.firstName)
    println(emp3.fullTime)

    println(Demo().dummy)

    val car = Car("Blue", "Toyota", 2015)
    println(car) // nice printout without having to override toString due to it being a data class
    val car2 = Car("Blue", "Toyota", 2015)
    println(car == car2) // don't have to override equals because comes for free in data class
    val car3 = car.copy()
    println(car3)
    val car4 = car.copy(year=2016)
    println(car4)
}

// primary constructor
class Employee(val firstName: String, /*var*/ fullTime: Boolean = true) {
    // custom getters and setters for fullTime
    var fullTime = fullTime
    get() {
        println("Running the custom get")
        return field
    }
    set(value) {
        println("Running the custom set")
        field = value
    }

}

/*class Employee constructor(val firstName: String) {

}*/

/*
class Employee constructor(firstName: String) {
    val firstName: String = firstName
}
*/

/* Long hand
class Employee constructor(firstName: String) {
    val firstName: String

    init {
        this.firstName = firstName
    }
}
*/

// you don't have to have a primary constructor
class Demo {
    val dummy: String

    constructor() {
        dummy = "hello"
    }
}

// no point declaring a property as private because things out of the file can't access them directly
// this is different from Java


data class Car(val color: String, val model: String, val year: Int) {

}

