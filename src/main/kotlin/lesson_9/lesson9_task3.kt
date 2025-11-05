package lesson_9

fun main() {

    val countEggForOnePortion = 2
    val countMilkForOnePortion = 50
    val countButterForOnePortion = 15

    val ingredientForOnPortion = listOf(countEggForOnePortion, countMilkForOnePortion, countButterForOnePortion)

    println("Введите кол-во порций")
    val count = readln().toInt()

    val countProducts = ingredientForOnPortion.map { it * count }

    println(
        "На $count порций вам понадобится: Яиц – ${countProducts[0]}," +
                " молока – ${countProducts[1]}, " +
                "сливочного масла – ${countProducts[2]}"
    )
}