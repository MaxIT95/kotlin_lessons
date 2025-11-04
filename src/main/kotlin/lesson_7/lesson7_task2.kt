package lesson_7

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    val range = 1000..9999

    var codeAuthorization: Int

    while (true) {
        codeAuthorization = range.random()
        println("Ваш код авторизации: $codeAuthorization")
        println("Введите код авторизации")
        val codeFromUser = readln()

        if (codeFromUser == codeAuthorization.toString()) {
            println("Добрый день!")
            break
        } else {
            println("Пароль введен неправильно!")
        }
    }
}