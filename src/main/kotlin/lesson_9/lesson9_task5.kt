package lesson_9

fun main() {

    val ingredientSet = sortedSetOf<String>()

    for (i in 1..5) {
        println("Введите название ингридиента:")
        ingredientSet.add(readln())
    }
    println("Ингридиенты: ${ingredientSet.joinToString(", ").replaceFirstChar { it.uppercase() }}")
}