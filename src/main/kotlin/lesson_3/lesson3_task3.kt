package lesson_3

fun main() {

    val originNumber = 8

    val multiplicationTable =
        """|$originNumber x 1 = ${originNumber * 1}
            |$originNumber x 2 = ${originNumber * 2}
            |$originNumber x 3 = ${originNumber * 3}
            |$originNumber x 4 = ${originNumber * 4}
            |$originNumber x 5 = ${originNumber * 5}
            |$originNumber x 6 = ${originNumber * 6}
            |$originNumber x 7 = ${originNumber * 7}
            |$originNumber x 8 = ${originNumber * 8}
            |$originNumber x 9 = ${originNumber * 9}""".trimMargin()

    println(multiplicationTable)
}