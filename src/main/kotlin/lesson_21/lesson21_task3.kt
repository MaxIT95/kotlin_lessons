package lesson_21

fun main() {
    val player = GamePlayerSecondVersion("John", 100, 100)
    println("Player is healthy: ${player.isHealthy()}")
}

fun GamePlayerSecondVersion.isHealthy(): Boolean {
    return currentHealth == maxHealth
}

class GamePlayerSecondVersion(val name: String, var currentHealth: Int, var maxHealth: Int)