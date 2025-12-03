package lesson_20

fun main() {

    val heal: (GamePlayer) -> Unit = { player -> player.currentHealth = player.maxHealth }
    val player = GamePlayer("John", 40, 100)

    println("Player health before healing: ${player.currentHealth}")
    heal(player)
    println("Player health after healing: ${player.currentHealth}")
}

class GamePlayer(val name: String, var currentHealth: Int, var maxHealth: Int)