package tutorial.textadventure.functions

/**
 * Created by afranzen on 1/23/18.
 */

// default return type is Unit
fun main(args: Array<String>) {
    println(labelMultiply(3, 4, "The result is: "))

    val emp = Employee("Jane")
    println(emp.upperCaseFirstName())

    val car1 = Car("blue", "Toyota", 2015)
    val car2 = Car("red", "Ford", 2016)
    val car3 = Car("grey", "Ford", 2017)
    printColors(car1, car2, car3/*, str = "Color: "*/)

    val numbers = arrayOf(1, 2, 3)

    // Spread operator *

    val manyCars = arrayOf(car1, car2, car3)
    // printColors(manyCars) // won't work for the printColors method because it wants a car not an array due to the vararg
    printColors(*manyCars) // need to have the * for it to work

    val moreCars = arrayOf(car2, car3)
    val car4 = car2.copy()
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4) // without the * we will get memory locations not the actual values
    for(c in lotsOfCars) {
        println(c)
    }

    val s = "this is all in lowercase"
    // println(Utils().upperFirstAndLast(s)) // uses Utils class
    println(s.upperFirstAndLast()) // piggybacks off of extension function below



}

// extension function
fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0, 1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) + substring(upperFirst.length - 1).toUpperCase()
}

fun whatever() = 3*4

// inline functions you just add inline to front of function, works best with lambda parameters
inline fun labelMultiply(operand1: Int, operand2: Int, label:String) =
    "$label ${operand1*operand2}"

/* Long hand for above
fun labelMultiply(operand1: Int, operand2: Int, label:String): String {
    return ("$label ${operand1*operand2}")
}
*/

class Employee(val firstName: String) {
    fun upperCaseFirstName() = firstName.toUpperCase()
}

fun printColors(vararg cars: Car/*, str: String*/) {
    for(car in cars) {
        println(car.color)
    }
}

data class Car(val color: String, val model: String, val year: Int) {

}