package lesson_15

fun main() {

    val jeep = Jeep(3)

    jeep.loadPassengers(3)
    jeep.ride()
    jeep.unloadPassengers(3)
    println("Jeep transported 3 passenger")

    jeep.loadPassengers(3)
    jeep.ride()
    jeep.unloadPassengers(3)
    println("Jeep transported 3 passenger")

    val cargoCar = CargoCar(1, 2)
    cargoCar.loadCargo(2)
    cargoCar.ride()
    cargoCar.unloadCargo(2)

    println("Cargo car transported 2 cargo")
}

interface PassengerTransporting {
    fun loadPassengers(passengers: Int)
    fun unloadPassengers(passengers: Int)
}

interface CargoTransporting {

    fun loadCargo(cargo: Int)
    fun unloadCargo(cargo: Int)
}

interface VehicleMoving {
    fun ride() {
        println("Transport is ride...")
    }
}

class CargoCar(val maxPassengers: Int, val maxCargo: Int) : CargoTransporting, PassengerTransporting,
    VehicleMoving {

    var currentCargo = 0
    var currentPassengers = 0

    override fun loadCargo(cargo: Int) {
        if (currentCargo + cargo <= maxCargo) {
            println("Loading cargo $cargo")
            this.currentCargo += cargo
            println("Current cargo loaded: $currentCargo")
        }
    }

    override fun unloadCargo(cargo: Int) {
        println("Unloading cargo $cargo")
        this.currentCargo -= cargo
        println("Current cargo loaded: $currentCargo")
    }

    override fun loadPassengers(passengers: Int) {
        if (currentPassengers + passengers <= maxPassengers) {
            println("Loading passengers: $passengers")
            currentPassengers += passengers
            println("Current passengers loaded: $currentPassengers")
        } else {
            println("Jeep is overloading by passengers!")
        }
    }

    override fun unloadPassengers(passengers: Int) {
        println("Unloading passengers $passengers from Jeep")
        currentPassengers -= passengers
        println("Current passengers in Jeep loaded: $currentPassengers")
    }
}

class Jeep(val maxPassenger: Int) : PassengerTransporting, VehicleMoving {

    var currentPassenger = 0

    override fun loadPassengers(passengers: Int) {
        if (currentPassenger + passengers <= maxPassenger) {
            println("Loading passengers: $passengers")
            currentPassenger += passengers
            println("Current passengers loaded: $currentPassenger")
        } else {
            println("Jeep is overloading by passengers!")
        }
    }

    override fun unloadPassengers(passengers: Int) {
        println("Unloading passengers $passengers from Jeep")
        currentPassenger -= passengers
        println("Current passengers in Jeep loaded: $currentPassenger")
    }
}