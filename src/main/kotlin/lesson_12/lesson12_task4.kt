package lesson_12

const val ABSOLUTE_ZERO = 273.15

fun main() {

    val firstWeatherInfo = DayWeatherDto(7, 3, true)
}

class DayWeatherDto(var dayTemperature: Int, var nightTemperature: Int, var isPrecipitation: Boolean) {

    init {
        this.dayTemperature = (dayTemperature - ABSOLUTE_ZERO).toInt()
        this.nightTemperature = (nightTemperature - ABSOLUTE_ZERO).toInt()
        println(toString())
    }

    override fun toString(): String {
        return "Дневная погода: $dayTemperature, ночная погода: $nightTemperature, наличие осадков: $isPrecipitation"
    }
}
