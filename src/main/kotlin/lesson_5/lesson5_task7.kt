package lesson_5

const val MAGIC_NUMBER_FUEL = 100

fun main() {

    println("Введите расстояние пездки в км")
    val distance = readln().toDouble()

    println("Введите расход топлива на 100 км в литрах")
    val consumption = readln().toDouble()

    println("Введите текущую цену за литр топлива")
    val price = readln().toDouble()

    val fuel = (distance * consumption) / MAGIC_NUMBER_FUEL
    val totalCotsFuel = fuel * price

    println("Общее кол-во топлива: $fuel. Итоговая стоимость: ${"%.02f".format(totalCotsFuel)}")
}
