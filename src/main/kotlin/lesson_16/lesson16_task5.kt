package lesson_16

fun main() {
    val player = Player("John", 100, 50)
    println("Start game. Health value: ${player.getHealth()}")

    player.takeDamage(40)
    player.heal(20)

    player.takeDamage(80)
    player.heal(100)
}

class Player(_name: String, _health: Int, _power: Int) {
    var name = _name
    private var health = _health
    private var power = _power
    private var isCanHealing = true

    fun getHealth() = health

    fun takeDamage(damage: Int) {
        if (checkIsDeath()) {
            println("Player already death.")
        } else {
            health -= damage
            println("Player taken damage. Health value $health")
            if (checkIsDeath()) {
                death()
            }
        }
    }

    fun heal(healValue: Int) {
        if (isCanHealing) {
            this.health += healValue
            println("Heal complete. Health: $health")
        } else {
            println("Player $name is dead.")
        }
    }

    private fun checkIsDeath(): Boolean {
        return health <= 0
    }

    private fun death() {
        this.health = 0
        this.power = 0
        this.isCanHealing = false
        println("Player ${this.name} is dead.")
    }
}