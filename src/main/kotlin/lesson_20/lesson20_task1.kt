package lesson_20

fun main() {
    val name = "Max"

    val greeting: () -> String = { "С наступающим новым годом, $name!" }

    println(greeting())
}