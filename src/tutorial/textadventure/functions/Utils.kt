package tutorial.textadventure.functions

/**
 * Created by afranzen on 1/23/18.
 */

class Utils {
    fun upperFirstAndLast(str: String): String {
        val upperFirst = str.substring(0, 1).toUpperCase() + str.substring(1)
        return upperFirst.substring(0, upperFirst.length - 1) + str.substring(upperFirst.length - 1).toUpperCase()
    }
}