package lesson_5

fun main() {

    val correctRangerNumbers = 0..42
    val correctNumbersList = mutableListOf<Int>()
    correctRangerNumbers.forEach { correctNumbersList.add(it) }

    println("Введите первое число")
    val firstNumber: Int = readln().toInt()

    println("Введите второе число")
    val secondNumber: Int = readln().toInt()

    if (firstNumber in correctRangerNumbers && secondNumber in correctRangerNumbers) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstNumber in correctRangerNumbers || secondNumber in correctRangerNumbers) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача")
    }
    println("Необходимые числа для победы: $correctNumbersList")
}