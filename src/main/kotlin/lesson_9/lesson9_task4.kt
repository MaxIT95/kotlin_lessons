package lesson_9

fun main() {

    println("Введите 5 ингридиентов через запятую")

    val inputText = readln()

    val ingredients = inputText.split(", ").sorted()

    println(ingredients)
}