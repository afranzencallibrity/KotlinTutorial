package tutorial.textadventure.declarations

typealias EmployeeSet = Set<Employee>

/**
 * Created by afranzen on 1/19/18.
 */

fun main(args: Array<String>) {
    // val - emmutable, can't change value
    val number: Int //val number = 25 // number is an int, other way val number: Int
    // default data type for this is an int, if we want it to be a short you have to do val number: Short = 25

    var number1: Int
    number1 = 10
    number1 = 20
    // can't do this with val

    // do val whenever possible

    // can do this because the instance property is mutable (var), can't assign a different instance to employee1
    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"
    // employee1 = Employee("Tim Watson", 100) // can't assign a completely different instance

    val employee2: Employee
    val number2 = 100

    if(number1 < number2) {
        employee2 = Employee("Jane Smith", 400)
    }
    else {
        employee2 = Employee("Mike Watson", 150)
    }

    // number1 = "hello" // can't change data type after initialized

    // String builder is actually using the Java string builder class, it doesn't have it's own class

    // Typealias
    val employees: EmployeeSet

    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)

    println(employeeOne == employeeTwo) // F
    println(employeeTwo == employeeThree) // T would be false in java, this is structural equality
    println(employeeOne.equals(employeeTwo)) // F
    println(employeeTwo.equals(employeeThree)) // T
    // Referential equalities, this is what would happen in Java with 2 equal signs
    println(employeeOne === employeeTwo) // F
    println(employeeTwo === employeeThree) // T

    val employeeFour = employeeTwo // referentially equal
    println(employeeFour === employeeTwo) // T

    println(employeeFour != employeeTwo) // F
    println(employeeFour !== employeeTwo) // F
    println(employeeTwo != employeeThree) // F
    println(employeeTwo !== employeeThree) // T

    val x = 0x00101101
    val y = 0x11011011

    val something: Any = employeeFour
    if(something is Employee) {
        //val newEmployee = something as Employee //casting in Kotlin // no cast needed because of smart casting which happens once you do the is check
        //println(newEmployee.name)
        // above is same as this
        println(something.name) // doesn't work if you change type of variable
    }

    println(employee1) // gives us what we would expect, override toString method to print something nice out

    val change = 4.22
    println("To show the value of change, we use $change") // prints value of change
    println("To show the value of change, we use \$change") // prints $change
    println("To show the value of change, we use $$change") // prints $

    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")
    println("The employee's id is ${employee1.id}") // not $employee.id, doesn't work because it's an expression

    // Raw/Tripled-Quoted terms - when you have to type in a file path
    val filePath = """c:\somedir\somedir2""" // don't have to esacpe the \

    val eggName = "Humpty"
    val nurseryRhyme = """$eggName Dumpty sat on the wall
                        *$eggName dumpty had a great fall
                        *all the king's horses and all the king's men
                        *couldn't put $eggName together again.""".trimMargin("*") // default trim character is |
    println(nurseryRhyme) // includes newlines within triple quoted string

}

class Employee(var name: String, val id: Int) {
    override fun equals(obj: Any?): Boolean {
        if(obj is Employee) {
            return name == obj.name && id == obj.id
        }

        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }


}