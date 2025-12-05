package lesson_21

fun main() {
    val skills = mapOf<String, Int>(
        Pair("speed", 55), Pair("magic", 30),
        Pair("power", 50), Pair("intellect", 25)
    )
    println("Max category is ${skills.maxCategory()}")
}

fun Map<String, Int>.maxCategory(): String {
    val pair = this.maxBy {
        it.value
    }
    return pair.key
}