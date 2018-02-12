package tutorial.textadventure.datatypes

import tutorial.textadventure.javacode.DummyClass
import java.math.BigDecimal

/**
 * Created by afranzen on 1/22/18.
 */

fun main(args: Array<String>) {
    val myInt = 10
    println("Default datatype is ${myInt is Int}")
    var myLong = 22L

    // Works in Java but not in Kotlin
    //myLong = myInt

    myLong = myInt.toLong() // must have the toLong in Kotlin

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort() // need toShort call

    // Double is default datatype

    var myDouble = 65.984
    println(myDouble is Double)

    val myFloat = 838.8492f
    println("This is a float ${myFloat is Float}")

    val char = 'b'
    // char can't be assigned a number like Java // val char: Char = 65 // can't treat characters like numbers
    val myCharInt = 65
    println(myCharInt.toChar()) // will give you 'A'

    val myBoolean: Boolean = true // val myBoolean = false

    // Can call Java methods and classes in Kotlin
    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)

    val names = arrayOf("John", "Jane", "Jill", "Joe")
    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4)

    val longs3 = arrayOf(1, 2, 3, 4)

    println(longs1 is Array<Long>)
    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)

    println(longs1[2])

    val evenNumbers = Array(16){ i -> i * 2 }

    for(number in evenNumbers) {
        println(number)
    }

    // val lotsOfNumbers = Array(100000) {i -> i + 1} // will initialize array with 1-100000
    val allZeros = Array(100) { 0 } // for every element make it 0

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)

    for(number in someArray) {
        println(number)
    }

    someArray = Array(6) { i -> (i + 1) * 10}

    for(number in someArray) {
        println(number)
    }

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    for(element in mixedArray) {
        println(element)
    }

    println(mixedArray is Array<Any>)

    val myIntArray = intArrayOf(3, 9, 434, 2, 33)
    DummyClass().printNumbers(myIntArray)

    // var someOtherArray = Array<Int>(5) // can't specify size of array without initializing it

    var someOtherArray = IntArray(5)
    for(number in someOtherArray) {
        println(number)
    }

    DummyClass().printNumbers(evenNumbers.toIntArray())

    val convertedIntArray = myIntArray.toTypedArray()
}