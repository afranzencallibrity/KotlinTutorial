package tutorial.textadventure.inheritance

import tutorial.textadventure.javacode.JavaEmployee
import java.time.Year

/**
 * Created by afranzen on 1/24/18.
 */

fun main(args: Array<String>) {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    // println(SomeClass.SomeCompanion.accessPrivateVar()) // if the companion has a name
    println(SomeClass.Companion.accessPrivateVar())

    val someClass1 = SomeClass.justAssign("this is the string as is")
    val someClass2 = SomeClass.upperOrLowerCase("this isn't the string as is", false)
    println(someClass1.someStr)
    println(someClass2.someStr)

    // have to go through the factory methods, can't instantiate the class

    var thisIsMutable = 45

    // anonymus instance
    wantsSomeInterface(object: SomeInterface {
        override fun mustImplement(num: Int): String  { //= "This is from mustImplement: ${num * 100}"
            thisIsMutable++
            return "This is from mustImplement: ${num * 100}"
        }
    })

    println(thisIsMutable)

    println(Department.ACCOUNTING.getDeptInfo())

    topLevel("I'm private!")

}

// enum, need semi-colons if you add functions to emun
enum class Department(val fullName: String, val numEmployee: Int) {
    HR("Human Resources", 5), IT("Information Technology", 10), ACCOUNTING("Accounting", 3), SALES("Sales", 20);

    fun getDeptInfo() = "This $fullName department has $numEmployee employees"
}

/*private*/ fun topLevel(str: String) = println("Top level function $str")

// Singleton
object CompanyCommunications {
    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"

    // everything in the same module should be able to access this with the keyword "internal"
    /*internal*/ fun getCopyrightLine() = "Copy \u00A9 $currentYear Our Company. All rights reserved."

}

// have to have an instance of this class in order to access function
class SomeClass private constructor(val someStr: String) {
    /* private val privateVar = 6 // can't declare static but it is private and final

    fun accessPrivateVar() {
        println("I'm accessing privateVar: $privateVar")
    }*/

    // everything in companion object is static, can call accessPrivateVar without needing an instance of the class
    // can use them to call private constructors
    companion object /*SomeCompanion can give them names*/ {
        private var privateVar = 6

        fun accessPrivateVar() {
            println("I'm accessing privateVar: $privateVar")
        }

        fun justAssign(str: String) = SomeClass(str)

        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            if(lowerCase) {
                return SomeClass(str.toLowerCase())
            }
            else {
                return SomeClass(str.toUpperCase())
            }
        }
    }


}

interface SomeInterface {
    fun mustImplement(num: Int) : String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeInterface ${si.mustImplement(22)}")
}