package lesson_2

fun main() {

    /*Сайт с расписанием поездов получает данные с сервера.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.*/

    val departureHour: Int = 9
    val departureMinutes: Int = 39
    val travelMinutes: Int = 457

    val minutes: Int = calculateArrivalTime(
        departureHour,
        departureMinutes
    );

    val minutesArrival = minutes + travelMinutes

    println("Час прибытия ${minutesArrival / 60}")
    println("Минуты прибытия ${minutesArrival % 60}")
}

fun calculateArrivalTime(departureTimeHour: Int, departureTimeMinutes: Int): Int {

    // перевести все в минуты
    val departureMinutes: Int = departureTimeMinutes.plus(departureTimeHour * 60)

    return departureMinutes
}


