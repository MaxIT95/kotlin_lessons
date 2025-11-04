package lesson_9

fun main() {

    val ingredients = mutableListOf("огурец", "помидор", "картошка")
    println(
        "В рецепте есть следующие ингридиенты: \n${ingredients.joinToString("\n")}"
    )
}