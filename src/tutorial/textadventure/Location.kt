package tutorial.textadventure

/**
 * Created by afranzen on 1/19/18.
 */

data class Location(val locationID: Int, val description:String) {
    val exits = mutableMapOf<String, Int>()

    init {
        exits["Q"] = 0
    }

    fun addExit(direction: String, destinationID: Int) {
        exits[direction] = destinationID
    }
}