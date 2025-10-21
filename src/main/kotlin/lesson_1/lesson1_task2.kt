package org.example.lesson_1

// благодарность, делаем либо val либо const на уровне класса
const val gratitudeMessage: String = "Thank for you purchase!"

fun main() {
// кол-во покупок, var т.к. изменяемая
    var orderCount: Int = 0

    println("order count $orderCount, gratitude message  $gratitudeMessage")

    var workersCount = 20000

//    println("workers count $workersCount")

    workersCount = workersCount - 1

    println("workers count $workersCount")
}
