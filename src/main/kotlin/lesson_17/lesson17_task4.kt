package lesson_17

fun main() {
    val parcel = Parcel(1, "firstLocation")

    println("counter: ${parcel.counterLocation}")
    parcel.location = "secondLocation"
    println("counter: ${parcel.counterLocation}")
}

class Parcel(val id: Int, _location: String) {

    var location = _location
        set(value) {
            field = value
            counterLocation++
        }

    var counterLocation = 0

}