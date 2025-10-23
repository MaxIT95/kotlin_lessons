package lesson_2

const val BONUS_PERCENT: Int = 20
const val ALL_PERCENT: Int = 100

fun main() {

    val crystalMass: Int = 7
    val ironMass: Int = 11

    val bonusCrystal: Int = crystalMass * BONUS_PERCENT / ALL_PERCENT
    val bonusIron: Int = ironMass * BONUS_PERCENT / ALL_PERCENT

    println("Бонусная кристаллическая руда $bonusCrystal")
    println("Бонусная железная руда $bonusIron")
}
