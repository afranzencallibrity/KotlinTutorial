package tutorial.textadventure.loops

/**
 * Created by afranzen on 1/24/18.
 */

fun main(args: Array<String>) {
    val range = 1..5 // inclusive 1, 2, 3, 4, 5
    for(i in range) {
        println(i)
    }

    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ" // can't loop through strings like this with the for loop

    val str = "Hello"
    for(c in str) {
        println(c)
    }

    // in operator to test whether the value is within a range

    println(3 in range) // T
    println('q' in charRange) // T
    println("CCC" in stringRange) // T
    println("CCCCCC" in stringRange) // T
    println("ZZZZZ" in stringRange) // F

    val backwardRange = 5.downTo(1)
    val r = 5..1
    println(5 in r) // F because it's not less than the end range
    println(5 in backwardRange) // T

    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    val reversedRange = range.reversed() // only with numeric types

    // numeric and char ranges you have a lot more available to you than string ranges

    for(num in 1..20 step 4) {
        println(num)
    }

    for(i in 20 downTo 10 step 5) {
        println(i)
    }

    for(i in 1 until 10) {
        println(i) // prints 1 to 9
    }

    val s = "goodbye"
    val sRange = 0..s.length

    val seasons = arrayOf("spring", "summer", "winter", "fall")
    for(season in seasons) {
        println(season)
    }

    for(index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    seasons.forEach{ println(it) }
    seasons.forEachIndexed{ index, value -> println("$value is season number $index")}

    val notASeason = "whatever" !in seasons
    println(notASeason) // T

    val notInRange = 32 !in 1..10
    println(notInRange) // T

    val str1 = "Hello"
    println('e' in str1) // T
    println('e' !in str1) // F



}