package lesson_20

fun main() {

    val elements = listOf("кнопка 1", "кнопка 2", "кнопка 3", "кнопка 4", "кнопка 5", "кнопка 6")

    val functions: List<() -> Unit> = elements.map { { println("Press button $it!") } }

    for (i in 0..<functions.size) {
        if (i % 2 == 0) {
            functions[i].invoke()
        }
    }
}