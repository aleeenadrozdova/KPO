/**
 *  Задание 1: Заменить все повторяющиеся элементы входного списка на "blahblah".
 *  (1 балл)
 */
fun replaceElements(array: List<String>): List<String> {
    val uniqueWords = HashSet<String>(array)
    val duplicateWords = HashSet<String>()
    for (item in array) {
        if (!uniqueWords.remove(item)) {
            duplicateWords.add(item)
        }
    }
    val mutableArray = array.toMutableList()
    for (i in mutableArray.indices) {
        if (mutableArray[i] in duplicateWords) {
            mutableArray[i] = "blahblah"
        }
    }
    return mutableArray
}


/**
 *  Задание 2: Вернуть количество уникальных слов в строке.
 *  Слова в строке обязательно разделяются пробелом.
 *  (1 балл)
 */
fun uniqueWords(text: String): Int {
    val words = text.split(' ')
    val uniqueWords = HashSet<String>(words)
    return uniqueWords.size
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val text = "r t r y t y i o"
    println(uniqueWords(text))

//     Вызвать для text и вывести результат замены на экран
    println(replaceElements(text.split(' ')).joinToString(", "))
}