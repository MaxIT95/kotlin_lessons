package lesson_7

fun main() {

    println("Введите число верхне границы последовательности")
    val upNumberInRange = readln().toInt()

    for (i in 0..upNumberInRange step 2) {
        println(i)
    }
}