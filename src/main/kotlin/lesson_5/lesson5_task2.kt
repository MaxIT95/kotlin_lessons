package lesson_5

import java.util.Calendar

const val AGE_OF_MAJORITY = 18

fun main() {

    val currentYear = Calendar.getInstance().get(Calendar.YEAR)

    println("Введите ваш год рождения")
    val birthYear: Int = readLine()?.toInt() ?: currentYear

    if (currentYear - birthYear >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
}