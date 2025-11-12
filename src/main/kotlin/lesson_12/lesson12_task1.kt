package lesson_12

fun main() {

    val firstWeatherInfo = DayWeatherInfo()
    val secondWeatherInfo = DayWeatherInfo()


    firstWeatherInfo.dayTemperature = 12
    firstWeatherInfo.nightTemperature = 5
    firstWeatherInfo.isPrecipitation = true

    secondWeatherInfo.dayTemperature = 55
    secondWeatherInfo.nightTemperature = 40
    secondWeatherInfo.isPrecipitation = true

    println(firstWeatherInfo)
    println(secondWeatherInfo)
}

class DayWeatherInfo() {
    var dayTemperature = 0
    var nightTemperature = 0
    var isPrecipitation = false

    override fun toString(): String {
        return "Дневная погода: $dayTemperature, ночная погода: $nightTemperature, наличие осадков: $isPrecipitation"
    }
}