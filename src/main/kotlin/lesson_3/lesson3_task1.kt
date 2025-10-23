package lesson_3

const val GREETING_DAY: String = "Добрый день %s"
const val GREETING_EVENING: String = "Добрый вечер %s"

fun main() {

    val userName: String = "Юрий"
    var greetingMessage: String? = null

    greetingMessage = GREETING_DAY.format(userName)
    println(greetingMessage)

    greetingMessage = GREETING_EVENING.format(userName)
    println(greetingMessage)

}
