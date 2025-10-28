package lesson_4

const val SUNNY_WEATHER = true
const val TEN_OPEN = true
const val AIR_HUMIDITY = 20
const val WINTER_SEASON = "Зима"


fun main() {

    val todayWeatherSunny = true
    val tentIsOpen = true
    val airHumidityPercent = 20
    val currentSeason = "Зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            todayWeatherSunny == SUNNY_WEATHER &&
                    tentIsOpen == TEN_OPEN && airHumidityPercent == AIR_HUMIDITY
                    && currentSeason != WINTER_SEASON
        }"
    )
}
