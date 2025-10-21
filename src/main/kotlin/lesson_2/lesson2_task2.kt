package lesson_2

fun main() {
    /*Задача 2 к Уроку 2

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с
            соответствующим названием. Все значения необходимо вывести в виде целых чисел.*/

    val countWorkers: Int = 50
    val salaryWorker: Int = 30000

    val countIntern: Int = 30
    val salaryIntern: Int = 20000

    // Расходы на выплату зарплаты постоянных сотрудников;
    val salaryConstantWorkers: Int = calculateSalary(countWorkers, salaryWorker)
    val salaryInterns: Int = calculateSalary(countIntern, salaryIntern)
    // Общие расходы по ЗП после прихода стажеров;
    val salaryWorkersAndInterns: Int = salaryConstantWorkers.plus(salaryInterns)

    // Средняя ЗП одного сотрудника после устройства стажеров.

    val averageSalaryAfterInternsComing: Int = calculateAverageSalary(
        countWorkers + countIntern,
        salaryWorkersAndInterns
    )

    println("Расходы на выплату зарплаты постоянных сотрудников: $salaryConstantWorkers")
    println("Общие расходы по ЗП после прихода стажеров: $salaryWorkersAndInterns")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalaryAfterInternsComing")
}

fun calculateAverageSalary(countAllWorkers: Int, salary: Int): Int {
    return salary / countAllWorkers
}

fun calculateSalary(countWorkers: Int, salary: Int): Int {
    return countWorkers * salary
}