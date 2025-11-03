package lesson_7

import java.lang.Thread.sleep

const val ONE_SECOND_IN_MS = 1000L

fun main() {

    println("Введите кол-во секунд для таймера")
    val second = readln().toInt()

    for (i in 1..second) {
        println("До конца осталось ${second - i} секунд")
        sleep(ONE_SECOND_IN_MS)
    }
    println("Время вышло!")
}