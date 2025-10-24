package lesson_2

import kotlin.math.pow

fun main() {

    val deposit: Double = 70000.0
    val creditPercent: Double = 16.7
    val period: Int = 20

    val totalAmount: Double = deposit * (1 + (creditPercent / 100) / 1).pow(period)

    println("Итоговая сумма ${"%.3f".format(totalAmount)}")
}