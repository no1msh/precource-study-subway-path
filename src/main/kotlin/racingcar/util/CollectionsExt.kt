package racingcar.util

fun <T : Comparable<T>> Iterable<T>.maxAll(): List<T> {
    val descending = sortedDescending()
    val maxElement = descending.firstOrNull() ?: return emptyList()
    val list = mutableListOf<T>()
    for (element in descending) {
        if (element < maxElement) break
        list.add(element)
    }
    return list
}