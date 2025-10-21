package lesson_2

fun main() {

    val scores: List<Int> = listOf(3, 4, 3, 5)

    val averageScores = calculateAverage(scores)

    println("Средннее арифметическое $averageScores")
}

fun calculateAverage(scores: List<Int>): Float {
    return (scores.sum().toFloat() / scores.size)
}