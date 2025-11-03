package lesson_8

fun main() {

    val ingredients = arrayOf("помидор", "огурец", "свинина", "соль")
    println(ingredients.joinToString(","))
    println("Введите ингридиент для замены")

    val ingredientForReplacement = readln()

    if (ingredients.contains(ingredientForReplacement)) {
        println("Чем заменить данный ингридиент?")
        val newIngredient = readln()
        val indexReplacement = ingredients.indexOf(ingredientForReplacement)
        ingredients[indexReplacement] = newIngredient
        println("Готово! Вы сохранили следующий список: ${ingredients.joinToString(", ")}")
    } else {
        println("Ингридиента $ingredientForReplacement нет в списке!")
    }
}