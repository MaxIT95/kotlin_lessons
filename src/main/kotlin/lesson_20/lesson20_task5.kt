package lesson_20

fun main() {
    val robot = Robot()

    robot.say()

    var modifier: (String) -> String ={ it.uppercase()}
    robot.modifier = modifier
        robot.say()
}

class Robot {

    var modifier: (String) -> String = { "$it" }

    val phrases = listOf("Hello boy", "Good boy!", "Your died..", "Have a nice day!", "Good luck boy...")

    fun say() {
        println(modifier.invoke(phrases.random()))
    }
}