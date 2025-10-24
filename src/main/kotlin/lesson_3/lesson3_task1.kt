package lesson_3

const val GREETING_DAY: String = "Добрый день"
const val GREETING_EVENING: String = "Добрый вечер"

fun main() {

    val userName: String = "Юрий"
    var greetingMessage: String = "$GREETING_DAY, $userName"

    println(greetingMessage)

    greetingMessage = "$GREETING_EVENING $userName"
    println(greetingMessage)
}
