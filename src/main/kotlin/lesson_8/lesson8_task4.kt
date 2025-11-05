package lesson_8

const val PRODUCT_NOT_FOUND = -1

fun main() {

    val ingredients = arrayOf("помидор", "огурец", "свинина", "соль")
    println(ingredients.joinToString(","))
    println("Введите ингридиент для замены")

    val ingredientForReplacement = readln()
    val indexReplacement = ingredients.indexOf(ingredientForReplacement)

    if (indexReplacement != PRODUCT_NOT_FOUND) {
        println("Чем заменить данный ингридиент?")
        val newIngredient = readln()
        ingredients[indexReplacement] = newIngredient
        println("Готово! Вы сохранили следующий список: ${ingredients.joinToString(", ")}")
    } else {
        println("Ингридиента $ingredientForReplacement нет в списке!")
    }
}