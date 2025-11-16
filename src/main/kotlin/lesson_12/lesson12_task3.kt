package lesson_12

fun main() {

    val firstWeatherInfo = DayWeatherDtoObject(7, 3, true)

    println(firstWeatherInfo)
}

class DayWeatherDtoObject(kelvinDayTemperature: Int, kelvinNightTemperature: Int, initIsPrecipitation: Boolean) {

    companion object Constants {
        const val ABSOLUTE_ZERO = 273.15
    }

    var dayTemperature = kelvinDayTemperature - ABSOLUTE_ZERO
    var nightTemperature = kelvinNightTemperature - ABSOLUTE_ZERO
    var isPrecipitation = initIsPrecipitation

    override fun toString(): String {
        return "Дневная погода: $dayTemperature, ночная погода: $nightTemperature, наличие осадков: $isPrecipitation"
    }
}
