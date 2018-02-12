package tutorial.textadventure.ifexpressions

/**
 * Created by afranzen on 1/24/18.
 */

fun main(args: Array<String>) {
    val someCondition = 69 < 22

    // put return value as last thing in block
    val num2 = if(someCondition) {
        println("something")
        50 // return statement
    }
    else {
        println("something else")
        592 // return statement
    }

    println(num2)

    println("The result of the if expression is ${
        if(someCondition) {
            println("something")
            50 // return statement
        }
        else {
            println("something else")
            592 // return statement
        }
    }")

}
