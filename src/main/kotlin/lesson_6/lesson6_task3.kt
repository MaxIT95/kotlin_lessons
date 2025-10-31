package lesson_6

import java.lang.Thread.sleep

fun main() {

    println("Введите кол-во секунд для таймера")

    val seconds = readln().toLong()

    var remainSeconds = seconds

    while (remainSeconds > 0) {
        println("Осталось секунд: $remainSeconds")
        sleep(1000)
        remainSeconds--
    }
    println("Время вышло")
}