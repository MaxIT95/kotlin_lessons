package lesson_2

fun main() {

    /*Задача на среднее арифметическое. В классе с углубленным изучением
     английского языка учится 4 человека. У них следующие баллы
     по профильному предмету 3, 4, 3, 5.
     Пишем часть школьного софта, который посчитает
     средний балл по английскому для этого класса.

  – Написать выражение, которое высчитывает средний балл;
  – Распечатать результат в консоль;
  – В консоли должно быть выведено дробное число с 2 знаками после запятой.*/
    val scores: List<Int> = listOf(3, 4, 3, 5)

    val averageScores = calculateAverage(scores)

    println("Средннее арифметическое $averageScores")
}


fun calculateAverage(scores: List<Int>): Float {

    var sumValue: Float = 0F

    scores.forEach {
        sumValue = sumValue.plus(it)
    }
    return (sumValue / scores.size)
}
