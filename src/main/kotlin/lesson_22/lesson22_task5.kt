package lesson_22

import java.time.LocalDateTime

fun main() {
    val alphaCentauriGuide = GalacticGuide(
        "Alpha Centauri",
        "Exoplanet Proxima " +
                "Centauri was discovered near Proxima Centauri, located in the habitable zone",
        LocalDateTime.parse("2016-01-05T00:00:00"),
        99999999
    )
    println("${alphaCentauriGuide.component1()}, " +
            "${alphaCentauriGuide.component2()}, " +
            "${alphaCentauriGuide.component3()}, " +
            "${alphaCentauriGuide.component4()}")
}

data class GalacticGuide(
    val name: String, val description: String,
    val dateTime: LocalDateTime, val distance: Int
)