package lesson_15

fun main() {
    val crucian = Crucian()
    val seagull = Seagull()
    val duck = Duck()

    crucian.swimmingMethod()
    seagull.flyMethod()
    duck.swimmingMethod()
    duck.flyMethod()
}

interface FlyingObject {
    fun flyMethod()
}

interface FloatingObject {
    fun swimmingMethod()
}

class Crucian : FloatingObject {
    override fun swimmingMethod() {
        println("Карась может плыть")
    }
}

class Seagull : FlyingObject {
    override fun flyMethod() {
        println("Чайка может летать")
    }
}

class Duck : FlyingObject, FloatingObject {
    override fun flyMethod() {
        println("Утка может летать")
    }

    override fun swimmingMethod() {
        println("Утка может плыть")
    }
}