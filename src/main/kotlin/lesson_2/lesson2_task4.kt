package org.example.lesson_2

fun main() {

    val crystalMass: Int = 7
    val ironMass: Int = 11

    val bonusCrystal: Int = crystalMass.times(0.2).toInt()
    val bonusIron: Int = ironMass.times(0.2).toInt()

    println("Бонусная кристаллическая руда $bonusCrystal")
    println("Бонусная железная руда $bonusIron")
}
