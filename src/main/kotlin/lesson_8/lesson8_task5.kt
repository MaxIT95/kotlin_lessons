package lesson_8

fun main() {

    println("Введите планируемое кол-во ингридиентов")
    val countIngredient = readln().toInt()

    val ingredients = Array(countIngredient) {
        println("Введите название ингридиента")
        readln().toCharArray()
    }
    println(ingredients.joinToString(", ") { it.joinToString("") })
}