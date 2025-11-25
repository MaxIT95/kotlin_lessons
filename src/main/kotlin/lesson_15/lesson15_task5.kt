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

    fun loadingPassengers(passengers: Int) {
        if (getCurrentPassengers() + passengers <= getPassengerCapacity()) {
            println("Loading passengers: $passengers")
            setCurrentPassengers(getCurrentPassengers() + passengers)
            println("Current passengers loaded: ${getCurrentPassengers()}")
        } else {
            println("Transport is overloading by passengers!")
        }
    }

    fun unloadingPassengers(passengers: Int) {
        println("Unloading passengers $passengers")
        setCurrentPassengers(getCurrentPassengers() - passengers)
        println("Current passengers loaded: ${getCurrentPassengers()}")
    }

    fun getPassengerCapacity(): Int
    fun getCurrentPassengers(): Int
    fun setCurrentPassengers(value: Int)
}

interface CargoTransporting {
    fun loadingCargo(cargo: Int) {
        if (getCurrentCargo() + cargo <= getCargoCapacity()) {
            println("Loading cargo $cargo")
            setCurrentCargo(getCurrentCargo() + cargo)
            println("Current cargo loaded: ${getCurrentCargo()}")
        }
    }

    fun unloadingCargo(cargo: Int) {
        println("Unloading cargo $cargo")
        setCurrentCargo(getCargoCapacity() - cargo)
        println("Current cargo loaded: ${getCurrentCargo()}")
    }

    fun getCargoCapacity(): Int
    fun getCurrentCargo(): Int
    fun setCurrentCargo(value: Int)
}

interface VehicleMoving {
    fun ride() {
        println("Transport is ride...")
    }
}

class CargoCar(
    val passengersCapacity: Int, val cargoCapacity: Int
) : CargoTransporting, PassengerTransporting, VehicleMoving {

    var currentCargo = 0
    var currentPassengers = 0

    override fun getCargoCapacity(): Int {
        return this.cargoCapacity
    }

    override fun getCurrentCargo(): Int {
        return this.currentCargo
    }

    override fun setCurrentCargo(value: Int) {
        this.currentCargo = value
    }

    override fun getPassengerCapacity(): Int {
        return passengersCapacity
    }

    override fun getCurrentPassengers(): Int {
        return currentPassengers
    }

    override fun setCurrentPassengers(value: Int) {
        this.currentPassengers = value
    }
}

class Jeep(val passengersCapacity: Int) : PassengerTransporting, VehicleMoving {

    var currentPassengers = 0

    override fun getPassengerCapacity(): Int {
        return this.passengersCapacity
    }

    override fun getCurrentPassengers(): Int {
        return currentPassengers
    }

    override fun setCurrentPassengers(value: Int) {
        this.currentPassengers = value
    }
}