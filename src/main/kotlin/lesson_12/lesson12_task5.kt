package lesson_12

import java.util.Random

const val ABSOLUTE_ZERO = 273.15

fun main() {

    val weatherMonthInfo = mutableListOf<DayWeatherDto>()
    val random = Random()
    val kelvinTempRange = 280..300
    for (i in 1..30) {
        weatherMonthInfo.add(DayWeatherDto(kelvinTempRange.random(),
            kelvinTempRange.random(), random.nextBoolean()))
    }
    println("count weather ${weatherMonthInfo.size}")

    val dayTemperatures = weatherMonthInfo.map { it.dayTemperature }
    val nightTemperatures = weatherMonthInfo.map { it.nightTemperature }
    val dayWithPrecipitation = weatherMonthInfo.filter { it.isPrecipitation }.size

    val averageDayTemp = dayTemperatures.average()
    val averageNightTemp = nightTemperatures.average()

    println("Средняя дневная температура: $averageDayTemp")
    println("Средняя ночная температура: $averageNightTemp")
    println("Кол-во дней с осадками: $dayWithPrecipitation")
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
