package org.example.lesson_1

import kotlin.math.min

// не смог придумать адекватное название, поэтому сделал две
const val secondsInOneMinute: Int = 60
const val minutesInOneHour: Int = 60

const val TEMPLATE_LOG: String = "Время, проведенное в космосе %s:%s:%s"

fun main() {

    val seconds: Int = 6490

    val minutes = seconds / secondsInOneMinute

    val hours: Int = minutes / minutesInOneHour
    val hoursAsString: String = formatIntAsString(hours)

    val minRemains: Int = minutes % minutesInOneHour
    val minRemainsAsString: String? = formatIntAsString(minRemains)

    val secRemains: Int = seconds % ((hours * minutesInOneHour * secondsInOneMinute) + (minRemains * 60))
    val secRemainsAsString: String = formatIntAsString(secRemains)

    println(
        "Время, проведенное в космосе ${
            String.format(
                TEMPLATE_LOG,
                hoursAsString, minRemainsAsString, secRemainsAsString
            )
        }"
    )
}

fun formatIntAsString(someInt: Int): String {

    return if (someInt.toString().length == 1) {
        "0$someInt"
    } else {
        someInt.toString()
    }
}
