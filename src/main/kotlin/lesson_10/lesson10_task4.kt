package lesson_10

const val NOT_NEED_NEXT_ROUND = "Нет"
const val HUMAN_WINNER = "человек"
const val MACHINE_WINNER = "робот"
const val DRAW = "ничья"

fun main() {

    var humanWinRounds = 0

    while (true) {
        val roundResult = startRoundAndGetWinner()

        if (roundResult == HUMAN_WINNER) {
            humanWinRounds++
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")

        if (readln().equals(NOT_NEED_NEXT_ROUND, true)) {
            break
        }
    }
    println("\nЧеловек выиграл $humanWinRounds партий")
}

fun startRoundAndGetWinner(): String {
    val machineValue = throwBones()
    println("Кости бросает робот...$machineValue")
    val humanValue = throwBones()
    println("Кости бросает человек...$humanValue")

    return defineResult(humanValue, machineValue)
}

fun defineResult(humanResult: Int, machineResult: Int): String {
    if (humanResult < machineResult) {
        return MACHINE_WINNER
    } else if (humanResult > machineResult) {
        return HUMAN_WINNER
    }
    return DRAW
}

fun throwBones(): Int = (1..6).random()