package lesson_12

fun main() {

    val firstWeatherInfo = DayWeatherDto(7, 3, true)
}

class DayWeatherDto {

    var dayTemperature: Int
    var nightTemperature: Int
    var isPrecipitation: Boolean

    companion object Constants {
        const val ABSOLUTE_ZERO = 273.15
    }

    constructor(_dayTemperature: Int, _nightTemperature: Int, _isPrecipitation: Boolean) {
        dayTemperature = (_dayTemperature - ABSOLUTE_ZERO).toInt()
        nightTemperature = (_nightTemperature - ABSOLUTE_ZERO).toInt()
        isPrecipitation = _isPrecipitation
        println(toString())
    }

    override fun toString(): String {
        return "Дневная погода: $dayTemperature, ночная погода: $nightTemperature, наличие осадков: $isPrecipitation"
    }
}
