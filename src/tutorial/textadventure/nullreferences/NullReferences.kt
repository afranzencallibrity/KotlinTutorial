package tutorial.textadventure.nullreferences

/**
 * Created by afranzen on 1/22/18.
 */

fun main(args: Array<String>) {
    // val str: String = null // get an error right away
    //val str: String? = null // need to question mark to work
    val str: String? = "This isn't null" // limited methods when using a null
    // need to do the check to get back other methods
    if(str != null) {
        str.toUpperCase()
    }

    str?.toUpperCase() // same as if statement, generates a null check under the covers

    val strOne: String? = null
    println("What happens when we do this: ${strOne?.toUpperCase()}") // prints null, no null pointer exception

    // val countryCode: String? = bankBranch?.address?.country?.countryCode
    // val countryCode: String? = bankBranch?.address?.country?.countryCode ?: "US" // can use Elvis operator

    // Elvis operator ?: lets you assign default value when value is null
    val str2: String = strOne ?: "This is the default value"
    println(str2)

    /* Does the same thing as above code

    if(str == null) {
        str2 = "This is the default value"
    }
    else {
        str2 = str
    }
    */

    // Try to cast array to a string // instead of exception a "null" is printed out
    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String
    println(str3)

    // Not null assertion - want to tell the compiler you are absolutely sure a value won't be null
    val strFour: String? = "This isn't null"
    //val strFour: String? = null // exception will be KotlinNullPointerReference
    val str4 = strFour!!.toUpperCase()

    /* Long hand for above code
    if(strFour == null) {
        throw exception
    }
    else {
        str.toUpperCase()
    }
    */

    // Will give us an exception
    /*val strTwo: String? = null
    val strThree = str!!
    val str5 = strThree.toUpperCase()*/

    // Don't string not null assertions together

    val str5: String? = "This isn't null"
    // printText(str5) // will complain because str5 could be nullable because of String?
    // can do !! but it could be null which would give us an exception
    // consider the let function

    str?.let { printText(it) }
    /*
    what we are trying to accomplish with let function
    if(str5 != null) {
        printText(str5)
    }
    */

    val str6: String? = null
    val anotherStr = "This isn't nullable"
    println(str4 == anotherStr) // equals operator is a safe operator // null check is done under the covers

    val nullableInts= arrayOfNulls<Int?> (5) // initialized to null // nullable even if you have Int instead of Int?
    for(i in nullableInts) {
        println(i)
    }

    println(nullableInts[3].toString())


}

fun printText(text: String) {
    println(text)
}
