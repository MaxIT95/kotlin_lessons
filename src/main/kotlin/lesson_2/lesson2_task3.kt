package lesson_2

const val COUNT_MINUTES_OR_SECONDS: Int = 60

const val LOG_TIME_TEMPLATE: String = "%02d"

fun main() {

    val departureHour: Int = 9
    val departureMinutes: Int = 39
    val travelMinutes: Int = 457

    val minutes: Int = departureMinutes + (departureHour * COUNT_MINUTES_OR_SECONDS)

    val summaryMinutesAfterArrival = minutes + travelMinutes

    val hoursArrival: Int = summaryMinutesAfterArrival / COUNT_MINUTES_OR_SECONDS
    val minutesArrival: Int = summaryMinutesAfterArrival % COUNT_MINUTES_OR_SECONDS

    println("Час прибытия ${LOG_TIME_TEMPLATE.format(hoursArrival)}")
    println("Минуты прибытия ${LOG_TIME_TEMPLATE.format(minutesArrival)}")
}