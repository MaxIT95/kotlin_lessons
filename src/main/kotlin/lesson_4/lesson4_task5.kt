package lesson_4

fun main() {

    val isShipBroken: Boolean = readLine().toBoolean()
    val workersCount: Int = readLine()?.toInt() ?: 0
    val boxFoodCount: Int = readLine()?.toInt() ?: 0
    val weatherIsGood: Boolean = readLine().toBoolean()

    val isShipSetSail =
        (!isShipBroken && 55 <= workersCount && workersCount <= 70 && 50 < boxFoodCount)
                || (isShipBroken && workersCount == 70
                && 50 <= boxFoodCount && weatherIsGood)

    println("Корабль может отправиться в плавание: $isShipSetSail")
}
