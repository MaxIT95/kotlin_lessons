package lesson_16

import kotlin.math.pow

private const val PI_NUMBER = 3.14

fun main() {
    val circle = Circle(5.0)

    println("square: ${circle.square()}")
    println("area: ${circle.area()}")
}

class Circle(radius: Double) {

    private val radiusValue: Double = radius

    fun square(): Double {
        return PI_NUMBER * radiusValue.pow(2.0)
    }

    fun area(): Double {
        return 2 * PI_NUMBER * radiusValue
    }
}