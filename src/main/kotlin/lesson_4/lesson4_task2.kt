package lesson_4

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_WEIGHT_VOLUME = 100

fun main() {

    var cargoWeight = 20
    var cargoVolume = 80

    println(
        "Груз с весом $cargoWeight кг и объемом $cargoVolume л" +
                " соответствует категории 'Average': ${
                    AVERAGE_WEIGHT_MIN < cargoWeight &&
                            cargoWeight <= AVERAGE_WEIGHT_MAX && cargoVolume < AVERAGE_WEIGHT_VOLUME
                }"
    )

    cargoWeight = 50
    cargoVolume = 100

    println(
        "Груз с весом $cargoWeight кг и объемом $cargoVolume л" +
                " соответствует категории 'Average': ${
                    AVERAGE_WEIGHT_MIN < cargoWeight &&
                            cargoWeight <= AVERAGE_WEIGHT_MAX && cargoVolume < AVERAGE_WEIGHT_VOLUME
                }"
    )
}
