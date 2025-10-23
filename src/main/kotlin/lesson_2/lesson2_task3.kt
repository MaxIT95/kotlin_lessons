package lesson_2

fun main() {

    val departureHour: Int = 9
    val departureMinutes: Int = 39
    val travelMinutes: Int = 457
    val countMinutesOrSeconds: Int = 60

    val minutes: Int = departureMinutes + (departureHour * countMinutesOrSeconds)

    val minutesArrival = minutes + travelMinutes

    println("Час прибытия ${formatIntAsString(minutesArrival / countMinutesOrSeconds)}")
    println("Минуты прибытия ${formatIntAsString(minutesArrival % countMinutesOrSeconds)}")
}

fun formatIntAsString(someInt: Int): String {

    return if (someInt.toString().length == 1) {
        "0$someInt"
    } else {
        someInt.toString()
    }
}