package lesson_10

const val MIN_COUNT_CHARS = 4

fun main() {

    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()

    if (notValidValue(login) || notValidValue(password)) {
        println("Логин или пароль недостаточно длинные")
    }
}

fun notValidValue(value: String): Boolean {
    return value.length < MIN_COUNT_CHARS
}