package lesson_8

fun main() {

    val ingredients = arrayOf("помидор", "огурец", "свинина", "соль")

    println("Введите ингридиент")
    val ingredientFromUser = readln()

    if (ingredientFromUser in ingredients) {
        println("Ингредиент $ingredientFromUser в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}