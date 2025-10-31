package lesson_6

import java.lang.Thread.sleep

const val MS_IN_ONE_SECOND = 1000

fun main() {

    println("Укажите кол-во секунд для таймера")
    val seconds = readln().toLong()

    sleep(seconds * MS_IN_ONE_SECOND)

    println("Прошло $seconds секунд")
}
