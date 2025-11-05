package lesson_9

const val NEED_ADD_PRODUCT = "да"

fun main() {

    val ingredients = mutableListOf("огурец", "помидор", "картошка")
    println("В рецепте есть базовые ингридиенты: $ingredients")

    println("Желаете добавить еще?")

    if (readln().equals(NEED_ADD_PRODUCT, true)) {
        println("Какой ингредиент вы хотите добавить?")
        ingredients.add(readln())
    }
    println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
}
