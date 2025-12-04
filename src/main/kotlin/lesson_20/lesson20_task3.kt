package lesson_20

fun main() {
    val gamer1 = Gamer(true)
    val gamer2 = Gamer(false)

    val checkDoor: (Gamer) -> String = { player: Gamer ->
        if (player.hasKey) {
            "Player open the door"
        } else {
            "Door is closed"
        }
    }
    println(checkDoor(gamer1))
    println(checkDoor(gamer2))
}

class Gamer(var hasKey: Boolean)