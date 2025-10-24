package lesson_3

fun main() {

    val originNumber: Int = 8
    var multiplicationTable = ""

    for (i in 1..9) {
        multiplicationTable = "$multiplicationTable$originNumber x $i = ${originNumber * i}\n"
    }

    println(multiplicationTable)
}