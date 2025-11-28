package lesson_18

fun main() {

    val screen = Screen()

    println(screen.draw(Circle(1, 5.0f)))
    println(screen.draw(Point(3, 2.0f)))
    println(screen.draw(Square(6, 9.0f)))
}

class Screen() {

    fun draw(shape: Circle): String {
        return "Draw circle, x=${shape.x}, y=${shape.y}"
    }

    fun draw(shape: Point): String {
        return "Draw point, x=${shape.x}, y=${shape.y}"
    }

    fun draw(shape: Square): String {
        return "Draw square, x=${shape.x}, y=${shape.y}"
    }
}

abstract class Shape(val x: Int, val y: Float)

class Circle(x: Int, y: Float) : Shape(x, y)
class Square(x: Int, y: Float) : Shape(x, y)
class Point(x: Int, y: Float) : Shape(x, y)