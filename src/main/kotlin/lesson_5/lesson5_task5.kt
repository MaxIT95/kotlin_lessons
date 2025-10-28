package lesson_5

import kotlin.random.Random

const val COUNT_NUMBERS = 3

fun main() {

    val winNumbers = generateRandomNumbers()

    val inputNumbers = mutableListOf<Int>()

    var i = 0

    while (i < COUNT_NUMBERS) {
        println("Введите число")
        val number = readln().toInt()
        inputNumbers.add(number)
        i++
    }
    val sameNumbersCount = winNumbers.intersect(inputNumbers).size

    when (sameNumbersCount) {
        3 -> println("Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз")
        else -> println("Вы неугадали ни одного числа")
    }
    println("Загаданные числа: $winNumbers")
}

fun generateRandomNumbers(): List<Int> {

    val numbers = mutableListOf<Int>()

    var i = 0

    while (i < COUNT_NUMBERS) {
        numbers.add(Random.nextInt(0, 42))
        i++
    }
    return numbers
}