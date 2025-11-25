package lesson_15

fun main() {
    val crucian = Crucian()
    val seagull = Seagull()
    val duck = Duck()

    crucian.swimming()
    seagull.fly()
    duck.run {
        crucian.swimming()
        seagull.fly()
        swimming()
        fly()
    }
}

interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swimming()
}

class Crucian : Swimmable {
    override fun swimming() {
        println("Карась может плыть")
    }
}

class Seagull : Flyable {
    override fun fly() {
        println("Чайка может летать")
    }
}

class Duck : Flyable, Swimmable {
    override fun fly() {
        println("Утка может летать")
    }

    override fun swimming() {
        println("Утка может плыть")
    }
}