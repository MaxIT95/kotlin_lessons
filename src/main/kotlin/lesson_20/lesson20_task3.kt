package lesson_20

fun main() {
    val gamer1 = Gamer(true)
    val gamer2 = Gamer(false)

    val key: (Gamer) -> String = { player: Gamer ->
        if (player.isHaveKey) {
            "Player open the door"
        } else {
            "Door is closed"
        }
    }
    println(key(gamer1))
    println(key(gamer2))
}

class Gamer(var isHaveKey: Boolean)