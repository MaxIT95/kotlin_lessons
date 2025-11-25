package lesson_15

fun main() {

    val jeep = Jeep(3)

    jeep.loadingPassengers(3)
    jeep.ride()
    jeep.unloadingPassengers(3)
    println("Jeep transported 3 passenger")

    jeep.loadingPassengers(3)
    jeep.ride()
    jeep.unloadingPassengers(3)
    println("Jeep transported 3 passenger")

    val cargoCar = CargoCar(1, 2)
    cargoCar.loadingCargo(2)
    cargoCar.ride()
    cargoCar.unloadingCargo(2)

    println("Cargo car transported 2 cargo")
}

interface PassengerTransporting {
    fun loadingPassengers(passengers: Int)
    fun unloadingPassengers(passengers: Int)
}

interface CargoTransporting {
    fun loadingCargo(cargo: Int)
    fun unloadingCargo(cargo: Int)
}

interface VehicleMoving {
    fun ride() {
        println("Transport is ride...")
    }
}

abstract class Vehicle(var passengerCapacity: Int, var cargoCapacity: Int?) : PassengerTransporting,
    CargoTransporting, VehicleMoving {

    var cargoCurrentCount = 0
    var passengerCurrentCount = 0

    override fun loadingPassengers(passengers: Int) {
            if (passengerCurrentCount + passengers <= passengerCapacity) {
                println("Loading passengers: $passengers")
                this.passengerCurrentCount += passengers
                println("Current passengers loaded: $passengerCurrentCount")
            } else {
                println("Transport is overloading by passengers!")
        }
    }

    override fun unloadingPassengers(passengers: Int) {
            println("Unloading passengers $passengers")
            this.passengerCurrentCount -= passengers
            println("Current passengers loaded: $passengerCurrentCount")
        }

    override fun loadingCargo(cargo: Int) {
        if (cargoCapacity != null) {
            if (cargoCurrentCount + cargo <= cargoCapacity!!) {
                println("Loading cargo $cargo")
                this.cargoCurrentCount += cargo
                println("Current cargo loaded: $cargoCurrentCount")
            }
        }
    }

    override fun unloadingCargo(cargo: Int) {
        if (cargoCapacity != null) {
            println("Unloading cargo $cargo")
            this.cargoCurrentCount -= cargo
            println("Current cargo loaded: $cargoCurrentCount")
        }
    }

}

class CargoCar(
    passengersCapacity: Int, cargoCapacity: Int
) : Vehicle(passengersCapacity, cargoCapacity)

class Jeep(passengers: Int) : Vehicle(passengers, null)