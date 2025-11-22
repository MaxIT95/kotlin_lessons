package lesson_14


fun main() {
    val iceBreaker = IceBreaker(5, 100, "колоть лед")
    val cargo = Cargo(2, 340, "вмещать много груза")
    val liner = Liner(10, 150, "вмещать много пассажирова")

    iceBreaker.demoAbility()
    cargo.demoAbility()
    liner.demoAbility()
}

open class Liner(
    val speed: Int = 0,
    val liftingCapacity: Int = 0,
    val ability: String?
) {
    //можно было бы и переопределять в каждом классе этот метод, без поля ability
    fun demoAbility() {
        println("Умею $ability")
    }
}

class IceBreaker(
    speed: Int,
    liftingCapacity: Int,
    ability: String?
) : Liner(speed, liftingCapacity, ability)

class Cargo(
    speed: Int,
    liftingCapacity: Int,
    ability: String?
) : Liner(speed, liftingCapacity, ability)

