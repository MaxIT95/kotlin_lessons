package lesson_14

fun main() {
    val iceBreaker = IceBreakerDto(5, 100, "колоть лед")
    val cargo = CargoDto(2, 340, "вмещать много груза")
    val liner = LinerDto(10, 150, "вмещать много пассажиров")

    iceBreaker.loadingMethod()
    cargo.loadingMethod()
    liner.loadingMethod()
}

abstract class BaseLinerDto(
    val speed: Int = 0,
    val liftingCapacity: Int = 0,
    val ability: String?
) {
    //можно было бы и переопределять в каждом классе этот метод, без поля ability
    fun demoAbility() {
        println("Умею $ability")
    }

    abstract fun loadingMethod()
}

class LinerDto(
    speed: Int = 0,
    liftingCapacity: Int = 0,
    ability: String?
) : BaseLinerDto(speed, liftingCapacity, ability) {

    override fun loadingMethod() {
        println("Лайнер выдвигает горизонтальный трап со шкафута")
    }
}

class IceBreakerDto(
    speed: Int,
    liftingCapacity: Int,
    ability: String?
) : BaseLinerDto(speed, liftingCapacity, ability) {

    override fun loadingMethod() {
        println("Грузовой корабль активирует погрузочный кран")
    }
}

class CargoDto(
    speed: Int,
    liftingCapacity: Int,
    ability: String?
) : BaseLinerDto(speed, liftingCapacity, ability) {

    override fun loadingMethod() {
        println("Ледокол открывает ворота со стороны кормы.")
    }
}