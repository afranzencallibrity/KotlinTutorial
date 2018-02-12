package tutorial.textadventure

/**
 * Created by afranzen on 1/19/18.
 */

fun main(args: Array<String>) {
    val locations = readLocationInfo()
    var loc = 64

    while(true) {
        // ?: Elvis operator, this is the default if statement turns out to be null
        val location = locations[loc] ?: Location(0,"Sorry, something went wrong, so the game will terminate")
        println(location.description)

        if(location.locationID == 0) {
            break
        }

        print("Available exits are: ")
        location.exits.keys.forEach {
            print("$it, ")
        }

        val direction = readLine()?.toUpperCase() ?: "Z"

        if(location.exits.containsKey(direction)) {
            // !! absolutely sure that this isn't going to be null
            loc = location.exits[direction]!!
        }
        else {
            println("You can't go in that direction")
        }
    }
}
