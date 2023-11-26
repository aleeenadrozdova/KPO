package sem3
/**
Задание 1: Сформировать целочисленный массив A из N элементов
при помощи ввода значений с клавиатуры (N вводит пользователь).
Вывести массив на экран. (1 балл)
 */
fun makeArray(): Array<Int> {
    print("Введите N: ")
    val n = readln().toInt()
    val arr = Array(n) {0}
    for (i in 0..<n) {
        print("Введите элемент $i: ")
        arr[i] = readlnOrNull()?.toInt()!!
    }


    return arr
}

/**
Задание 2: Написать функцию для сортировки массива по убыванию и его вывода на экран.
Использовать встроенные функции. (0.5 балла)
 */
fun sortArrayDesc(arr: Array<Int>) {
    arr.sortDescending()
    println("Массив: ${arr.joinToString(", ")}")
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val arr = makeArray()

    sortArrayDesc(arr)
}