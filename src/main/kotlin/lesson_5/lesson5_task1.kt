package lesson_5

import kotlin.random.Random

fun main() {

    val firstNumber = Random.nextInt(100)
    val secondNumber = Random.nextInt(100)
    val correctSum = firstNumber + secondNumber

    println("Введите сумму чисел $firstNumber и $secondNumber")

    val sumFromUser = readLine()?.toInt()

    if (correctSum == sumFromUser) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
