package lesson_15

fun main() {
    val temp = Temperature(33)
    val precipitationAmount = PrecipitationAmount(85)

    val server = WeatherServer()

    server.sendRequestToServer(temp)
    server.sendRequestToServer(precipitationAmount)
}

class WeatherServer {
    fun sendRequestToServer(request: WeatherStationStats) {

        when (request) {
            is Temperature -> println("Temperature ${request.value} C")
            is PrecipitationAmount -> println("PrecipitationAmount ${request.value}%")
            else -> println("Unknown request type ${request.value}")
        }
    }
}

abstract class WeatherStationStats(val value: Int)

class Temperature(value: Int) : WeatherStationStats(value)

class PrecipitationAmount(value: Int) : WeatherStationStats(value)