package lesson_8

fun main() {

    val countViews = arrayOf(4, 2, 13, 5, 6, 29, 8)

    var sumViews = 0

    countViews.forEach({
        sumViews = sumViews + it
    })
    println("Кол-во просмотров за неделю: $sumViews")
}