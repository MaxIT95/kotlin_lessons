package lesson_5

const val CORRECT_LOGIN = "Zaphod"
const val CORRECT_PASSWORD = "PanGalactic"

fun main() {

    println("Введите ваш логин")
    val login = readln()

    if (login == CORRECT_LOGIN) {
        println("Введите ваш пароль")
        val password = readln()

        if (password == CORRECT_PASSWORD) {
            println("Добро пожаловать на борт, $login!")
        } else {
            println("Неправильный пароль. Доступ запрещен.")
        }
    } else {
        println("Пользователь с логином $login не найден. Зарегистрируйте нового пользователя.")
    }
}