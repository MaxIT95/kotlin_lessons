package lesson_6

import kotlin.random.Random

fun main() {

    val tryCount = 3

    var currentTry = 1

    while (currentTry <= tryCount) {
        val firstNumber = Random.nextInt(1, 9)
        val secondNumber = Random.nextInt(1, 9)
        val correctDecision = firstNumber + secondNumber

        println("Решите математический пример: $firstNumber + $secondNumber")

        val decisionFromUser = readln().toInt()

        if (correctDecision == decisionFromUser) {
            println("Добро пожаловать!")
            break
        } else {
            println("Ответ неверный. Осталось попыток: ${tryCount - currentTry}")

            if (tryCount == currentTry) {
                println("\nДоступ запрещен")
            }
            currentTry++
        }
    }
}