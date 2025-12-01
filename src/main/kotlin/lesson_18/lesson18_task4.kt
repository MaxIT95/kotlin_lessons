package lesson_18

import kotlin.math.pow

fun main() {

    val rectangleBox = RectangleBox(4, 1, 4)
    val cubeBox = Cube(5.0)

    println(rectangleBox.square())
    println(cubeBox.square())
}

interface CalculateBox {
    fun square(): Double
}

class RectangleBox(val length: Int, val height: Int, val width: Int) : CalculateBox {
    override fun square(): Double {
        return (2 * (length * width + length * height + width * height)).toDouble()
    }
}

class Cube(val ribLength: Double) : CalculateBox {
    override fun square(): Double {
        return 6 * ribLength.pow(2.0)
    }
}