package lesson_21

fun main() {
    val listNumbers = listOf(1, 2, 3, 4, 5, 8, 10, 7)
    println(listNumbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    var sum = 0

    this.forEach {
        if (it % 2 == 0) {
            sum += it
        }
    }
    return sum
}
