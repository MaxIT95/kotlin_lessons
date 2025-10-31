package lesson_6

import kotlin.random.Random

fun main() {

    val winNumber = Random.nextInt(1, 9)
    val tryCount = 5
    var currentTry = 1

    while (currentTry <= tryCount) {
        println("Введите число")
        val numberFromConsole = readln().toInt()

        if (numberFromConsole == winNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неугадал! Осталось попыток: ${tryCount - currentTry}")

            if (tryCount == currentTry) {
                println("\nБыло загадано число $winNumber")
            }
        }
        currentTry++
    }

}