package sem3

import kotlin.math.sqrt

/**
Задание 1: Функция,спрашивающая у пользователя его ФИО и выводящая его на экране.
(0.5 балла)
Формат вывода:
" Фамилия:
Имя:
Отчество:
"
 */
fun askForInput() {
    print("Введите ФИО через пробел: ")
    val fio = readlnOrNull()?.split(' ')

    println("Фамилия: ${fio?.get(0)}")
    println("Имя: ${fio?.get(1)}")
    println("Отчество: ${fio?.get(2)}")
}

/**
Задание 2: Функция, вычисляющая и возвращающая корни квадратного уравнения. (1 балл)
 */
fun quadraticRoots(a: Double, b: Double, c: Double): Pair<Double, Double> {
    val d = sqrt(b*b-4*a*c)
    return (-b-d)/2/a to (-b+d)/2/a
}

/**
Задание 3: Вывести на экран трёхзначные десятичные числа s, все цифры которых одинаковы.
(2 балла)
 */
fun printSameDigitNumbers() {
    for (i in 1..<10) {
        println(i*111)
    }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    askForInput()

    val roots = quadraticRoots(-5.0, 4.0, 3.0)
    println("X1 = ${roots.first}; X2 =${roots.second}")

    printSameDigitNumbers()
}