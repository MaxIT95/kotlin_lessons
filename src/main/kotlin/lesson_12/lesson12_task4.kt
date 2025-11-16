package lesson_12

fun main() {

    val firstWeatherInfo = DayWeatherDtoInfo(7, 3, true)
}

class DayWeatherDtoInfo(var dayTemperature: Int, var nightTemperature: Int, var isPrecipitation: Boolean) {

    init {
        this.dayTemperature = (dayTemperature - ABSOLUTE_ZERO).toInt()
        this.nightTemperature = (nightTemperature - ABSOLUTE_ZERO).toInt()
        println(toString())
    }

    override fun toString(): String {
        return "Дневная погода: $dayTemperature, ночная погода: $nightTemperature, наличие осадков: $isPrecipitation"
    }
}
