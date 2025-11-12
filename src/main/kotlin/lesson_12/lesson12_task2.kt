package lesson_12

fun main() {

    val firstWeatherInfo = DayWeatherData(7, 3, true)

    println(firstWeatherInfo)
}

class DayWeatherData(var dayTemperature: Int, var nightTemperature: Int, var isPrecipitation: Boolean) {

    override fun toString(): String {
        return "Дневная погода: $dayTemperature, ночная погода: $nightTemperature, наличие осадков: $isPrecipitation"
    }
}