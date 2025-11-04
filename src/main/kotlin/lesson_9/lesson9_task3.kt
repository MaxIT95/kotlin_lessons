package lesson_9

fun main() {

    val countEggForOnePortion = 2
    val countMilkForOnePortion = 50
    val countButterForOnePortion = 15

    val ingredientForOnPortion = listOf(countEggForOnePortion, countMilkForOnePortion, countButterForOnePortion)

    println("Введите кол-во порций")
    val count = readln().toInt()

    println(
        "На $count порций вам понадобится: Яиц – ${ingredientForOnPortion[0] * count}," +
                " молока – ${ingredientForOnPortion[1] * count}, " +
                "сливочного масла – ${ingredientForOnPortion[2] * count}"
    )
}
