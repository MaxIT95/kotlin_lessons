package lesson_14

import kotlin.math.pow

const val BLACK_COLOR = "black"
const val WHITE_COLOR = "white"
const val PI_NUMBER = 3.14

fun main() {

    val figures = mutableListOf(
        Shape(3, BLACK_COLOR),
        Shape(7, WHITE_COLOR),
        Rectangle(3, 4, BLACK_COLOR),
        Rectangle(9, 1, WHITE_COLOR)
    )
    println(
        "Сумма периметров всех черный фигур: ${
            figures.filter { it.color == BLACK_COLOR }.sumOf { it.getPerimeter() }
        }")
    println(
        "Сумма площадей всех белых фигур: ${
            figures.filter { it.color == WHITE_COLOR }.sumOf { it.getSquare() }
        }")
}

abstract class Figure(val color: String) {

    abstract fun getSquare(): Double
    abstract fun getPerimeter(): Double
}

class Shape(val radius: Int, color: String) : Figure(color) {

    override fun getSquare(): Double {
        return PI_NUMBER * radius.toDouble().pow(radius.toDouble())
    }

    override fun getPerimeter(): Double {
        return 2 * PI_NUMBER * radius
    }
}

class Rectangle(val width: Int, val height: Int, color: String) : Figure(color) {

    override fun getSquare(): Double {
        return (width * height).toDouble()
    }

    override fun getPerimeter(): Double {
        return 2 * (width + height).toDouble()
    }
}