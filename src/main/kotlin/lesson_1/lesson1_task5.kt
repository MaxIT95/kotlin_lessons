package lesson_1

// не смог придумать адекватное название, поэтому сделал две
const val secondsInOneMinute: Int = 60
const val minutesInOneHour: Int = 60
const val LOG_TIME_TEMPLATE: String = "%02d"
const val TEMPLATE_LOG: String = "Время, проведенное в космосе %s:%s:%s"

fun main() {

    val seconds: Int = 6490

    val minutes = seconds / secondsInOneMinute

    val hours: Int = minutes / minutesInOneHour
    val hoursAsString: String = LOG_TIME_TEMPLATE.format(hours)

    val minRemains: Int = minutes % minutesInOneHour
    val minRemainsAsString: String? = LOG_TIME_TEMPLATE.format(minRemains)

    val secRemains: Int = seconds % ((hours * minutesInOneHour * secondsInOneMinute) + (minRemains * 60))
    val secRemainsAsString: String = LOG_TIME_TEMPLATE.format(secRemains)

    println(
        TEMPLATE_LOG.format(
            hoursAsString, minRemainsAsString, secRemainsAsString
        )
    )
}
