package lesson_9

fun main() {

    var ingredient: String
    val ingredientList = mutableListOf<String>()

    for (i in 1..5) {

        while (true) {
            println("Введите название ингридиента:")
            ingredient = readln()

            if (!ingredientList.contains(ingredient)) {
                ingredientList.add(ingredient)
                break
            }
        }
    }
    ingredientList.sort()
    ingredientList[0] = ingredientList[0].substring(0, 1).uppercase() + ingredientList[0].substring(1)

    println("Ингридиенты: ${ingredientList.joinToString(", ")}")
}