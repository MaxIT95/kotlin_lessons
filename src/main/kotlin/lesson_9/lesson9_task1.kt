package lesson_9

fun main() {

    val ingredients = listOf("огурец", "помидор", "картошка")
    println(
        "В рецепте есть следующие ингридиенты: \n${ingredients.joinToString("\n")}"
    )
}