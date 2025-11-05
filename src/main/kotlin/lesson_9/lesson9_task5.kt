package lesson_9

fun main() {

    val ingredientSet = mutableSetOf<String>()

    for (i in 1..5) {
        println("Введите название ингридиента:")
        ingredientSet.add(readln())
    }
    val sortedSet = ingredientSet.toSortedSet()

    val firstProduct = sortedSet.elementAt(0)

    sortedSet.remove(firstProduct)
    sortedSet.add(firstProduct.replaceFirstChar { it.uppercase() })

    println("Ингридиенты: ${sortedSet.joinToString(", ")}")
}