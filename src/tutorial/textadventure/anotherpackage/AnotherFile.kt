package tutorial.textadventure.anotherpackage

import tutorial.textadventure.functions.upperFirstAndLast as ufal
import tutorial.textadventure.inheritance.CompanyCommunications as Comm // can rename reference
import tutorial.textadventure.inheritance.topLevel
import tutorial.textadventure.inheritance.Department.*

/**
 * Created by afranzen on 1/24/18.
 */

fun main(args: Array<String>) {
    topLevel("Hello from AnotherFile")
    println(Comm.getCopyrightLine())
    println(IT.getDeptInfo())
    println(SALES.getDeptInfo())
    println("some string".ufal())
}