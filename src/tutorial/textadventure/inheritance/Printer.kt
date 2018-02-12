package tutorial.textadventure.inheritance

/**
 * Created by afranzen on 1/23/18.
 */

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Brother 1234", 15)
    laserPrinter.printModel()

    SomethingElse("whatever")
}

abstract class Printer(val modelName: String) {
    // to be able to extend or override it needs to have the "open" type word
    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double // abstract classes are "open" by default
}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {
    //constructor(): super // if Printer doesn't have a primary constructor

    // to be able to extend or override it needs to have the "override" type word
    override fun printModel() = println("The model name of this laser printer is $modelName")

    override fun bestSellingPrice(): Double = 129.99
}

class SpecialLaserPrinter(modelName: String, ppm: Int): LaserPrinter(modelName, ppm) {


}

open class Something: MySubInterface {
    val someProperty: String
    override val number: Int = 25

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }

    override fun MyFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun mySubFuncation(num: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class SomethingElse: Something {
    constructor(someOtherParameter: String): super(someOtherParameter) {
        println("I'm in the child's constructor")
    }

}

//can't use open on data class because they are close-typed
/*open data class DataClass(val number: Int) {

}*/

// extendable by default so you don't have to say that they are open
interface MyInterface {
    val number: Int
    // val number2: Int = 50 // can't use property initialization
    // concrete property
    val number2: Int
        get() = number * 100  // can't access the backing "field" like a class

    fun MyFunction(str: String): String
}

interface MySubInterface: MyInterface {
    fun mySubFuncation(num: Int): String
}