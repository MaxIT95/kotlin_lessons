package org.example.lesson_1

const val DOUBLE_POINT: String = ":"

fun main() {

    val year: String = "1961"
    var hour: String = "09"
    var minutes: String = "07"

    println("год взлета $year")
    println("час взлета $hour")
    println("минута взлета $minutes")

    hour = "10"
    minutes = "55"

    print("Время посадки $hour")
    print(DOUBLE_POINT)
    print(minutes)

}
