package lesson_3

fun main() {

    val message = "D2-D4;0"

    val splitString = message.split("-", ";")

    val from = splitString[0]
    val to = splitString[1]
    val strokeNumber = splitString[2]

    println("Откуда $from")
    println("Куда $to")
    println("Номер хода $strokeNumber")
}
