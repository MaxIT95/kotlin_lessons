package lesson_10

const val MIN_COUNT_CHARS = 4

fun main() {

    while (true) {
        println("Введите логин")
        val login = readln()
        println("Введите пароль")
        val password = readln()

        if (isValidValue(login) && isValidValue(password)) {
            println("Добро пожаловать!")
            break
        } else {
            println("Логин или пароль недостаточно длинные")
        }
    }
}

fun isValidValue(value: String): Boolean {
    return value.length < MIN_COUNT_CHARS
}

