package lesson_2

fun main() {

    val departureHour: Int = 9
    val departureMinutes: Int = 39
//    val travelMinutes: Int = 457
    val travelMinutes: Int = 445
    val countMinutesOrSeconds: Int = 60

    val minutes: Int = departureMinutes + (departureHour * countMinutesOrSeconds)

    val minutesArrival = minutes + travelMinutes

    println("Час прибытия ${minutesArrival / countMinutesOrSeconds}")
    println("Минуты прибытия ${minutesArrival % countMinutesOrSeconds}")
}