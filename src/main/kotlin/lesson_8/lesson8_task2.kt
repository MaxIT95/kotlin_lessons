package lesson_8

fun main() {

    val ingredients = arrayOf("помидор", "огурец", "свинина", "соль")

    println("Введите ингридиент")
    val ingredientFromUser = readln()

    var isExistIngredientInReceipt = false

    for (i in ingredients) {
        if (i == ingredientFromUser) {
            isExistIngredientInReceipt = true
        }
    }
    if (isExistIngredientInReceipt) {
        println("Ингредиент $ingredientFromUser в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}