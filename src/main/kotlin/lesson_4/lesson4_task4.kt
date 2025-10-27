package lesson_4

fun main() {

    val currentTrainingDay = 5

    println(
        """|Упражнения для рук: ${currentTrainingDay % 2 != 0}                 
                   |Упражнения для ног: ${currentTrainingDay % 2 == 0}
|Упражнения для спины:  ${currentTrainingDay % 2 == 0}
|Упражнения для пресса: ${currentTrainingDay % 2 != 0}""".trimMargin()
    )
}
