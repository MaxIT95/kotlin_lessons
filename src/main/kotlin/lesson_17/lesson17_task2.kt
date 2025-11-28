package lesson_17

fun main() {

    val ship = Ship("ship", 4, 1)

    ship.name = "newShip"
}

class Ship(_name: String, val averageSpeed: Int, val port: Int) {

    var name = _name
        get() = field
        set(value) = println("Name is immutable")
}