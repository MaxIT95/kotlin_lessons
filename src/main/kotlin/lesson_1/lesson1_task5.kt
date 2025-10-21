package org.example.lesson_1

import kotlin.math.min

fun main() {

    val seconds: Int = 6490

    val minutes = seconds / 60

    val hours: Int = minutes / 60
    val hoursAsString: String = formatIntAsString(hours)

    val minRemains: Int = minutes % 60
    val minRemainsAsString: String? = formatIntAsString(minRemains)

    val secRemains: Int = seconds - (hours * 60 * 60) - (minRemains * 60)
    val secRemainsAsString: String = formatIntAsString(secRemains)

    println("Время, проведенное в космосе $hoursAsString:$minRemainsAsString:$secRemainsAsString")
}

fun formatIntAsString(someInt: Int): String {

    return if (someInt.toString().length == 1) {
        "0$someInt"
    } else {
        someInt.toString()
    }
}
