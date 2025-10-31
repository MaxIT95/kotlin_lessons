package lesson_5

import kotlin.math.pow

const val CENTIMETERS_IN_ONE_METER = 100
const val DOUBLE_POW = 2
const val MIN_IMT = 18.5
const val NORMAL_IMT = 25

fun main() {

    println("Введите ваш вас в кг")
    val weight = readln().toDouble()

    println("Введите ваш рост в см")
    var height = readln().toDouble()

    height = height / CENTIMETERS_IN_ONE_METER

    val indexMassBody: Double = weight / height.pow(DOUBLE_POW)

    if (indexMassBody < MIN_IMT) {
        println("ИМТ = ${"%.02f".format(indexMassBody)}. Недостаточная масса тела")
    } else if (indexMassBody >= MIN_IMT && indexMassBody < NORMAL_IMT) {
        println("ИМТ = ${"%.02f".format(indexMassBody)}. Нормальная масса тела")
    } else {
        println("ИМТ = ${"%.02f".format(indexMassBody)}. Ожирение")
    }
}