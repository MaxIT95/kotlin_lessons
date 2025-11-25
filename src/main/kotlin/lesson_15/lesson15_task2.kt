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
        if (request::class == Temperature::class) {
            println("Temperature ${request.value} C")
        } else {
            println("PrecipitationAmount ${request.value}%")
        }
    }
}

abstract class WeatherStationStats(val value: Int)

class Temperature(value: Int) : WeatherStationStats(value)

class PrecipitationAmount(value: Int) : WeatherStationStats(value)