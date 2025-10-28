package lesson_4

const val MIN_WORKERS = 55
const val MAX_WORKERS = 70
const val MIN_BOX_FOODS = 50
const val SHIP_NOT_BROKEN = false
const val SHIP_IS_BROKEN = true
const val WEATHER_IS_GOOD = true

fun main() {

    val isShipBroken: Boolean = readLine().toBoolean()
    val workersCount: Int = readln().toInt()
    val boxFoodCount: Int = readln().toInt()
    val weatherIsGood: Boolean = readLine().toBoolean()

    val isShipSetSail =
        (isShipBroken == SHIP_NOT_BROKEN && MIN_WORKERS <= workersCount && workersCount <= MAX_WORKERS && 50 < MIN_BOX_FOODS)
                || (isShipBroken == SHIP_IS_BROKEN && workersCount == MAX_WORKERS
                && MIN_BOX_FOODS <= boxFoodCount && weatherIsGood == WEATHER_IS_GOOD)

    println("Корабль может отправиться в плавание: $isShipSetSail")
}
