package lesson_20

fun main() {
    val robot = Robot()

    robot.say()

    val modifier: (String) -> String = { it.reversed() }
    robot.setModifier(modifier)
    robot.say()
}

class Robot {
    private var modifier: (String) -> String = { it }

    private val phrases = listOf("Hello boy", "Good boy!", "Your died..", "Have a nice day!", "Good luck boy...")

    fun setModifier(function: (String) -> String) {
        this.modifier = function
    }

    fun say() {
        println(modifier(phrases.random()))
    }
}