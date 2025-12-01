package lesson_20

fun main() {
    val greeting: (String) -> String = { name: String -> "С наступающим новым годом, $name!" }

    println(greeting("Max"))
}