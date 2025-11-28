package lesson_17

fun main() {

    val quiz = Quiz("Who?", "Me")

    println(quiz.answer)
    println(quiz.question)
}

class Quiz(_answer: String, _question: String) {

    var answer: String = _answer
        get() = field

    var question: String = _question
        get() = field
        set(value) {
            field = value
        }
}