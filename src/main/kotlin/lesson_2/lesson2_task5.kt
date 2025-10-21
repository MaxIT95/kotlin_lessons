package org.example.lesson_2

import kotlin.math.round

fun main() {

    val firstPayment: Int = 70000
    val creditPercent: Double = 16.7
    val period: Int = 20

    val count = (1 + (creditPercent / 100) / 1)
    var totalAmount: Double = firstPayment * count

    var i = 1

    while (i < period) {
        totalAmount = totalAmount * count
        i++
    }
    println("Итоговая сумма ${round(totalAmount * 1000) / 1000}")
}