package lesson_13

fun main() {

    println("введите номер телефона")
    try {
        readln().toLong()
    } catch (ex: NumberFormatException) {
        println("Ошибка ${ex::class.simpleName}")
    }
}