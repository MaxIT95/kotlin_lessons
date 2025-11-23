package lesson_14

fun main() {
    val planet = Planet(
        "alfa-centavra", listOf(
            Satellite("sputnik1", true),
            Satellite("sputnik2", false)
        ), false
    )
    println(planet)
}

abstract class CosmosEntity(val isHaveAtmosphere: Boolean)

class Planet(
    val name: String, val satellites: List<Satellite>,
    isHaveAtmosphere: Boolean
) : CosmosEntity(isHaveAtmosphere) {
    override fun toString(): String {
        return "Planet(name='$name', satellites=${satellites.map { it.name }})"
    }
}

class Satellite(val name: String, isHaveAtmosphere: Boolean) : CosmosEntity(isHaveAtmosphere)