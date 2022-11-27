package racingcar.util

fun String.toIntOrThrow(): Int {
    return requireNotNull(toIntOrNull())
}

inline fun String.toIntOrThrow(lazyMessage: () -> Any): Int {
    return requireNotNull(toIntOrNull(), lazyMessage)
}

fun String.isUpperOrLower(): Boolean = all { it.isUpperCase() || it.isLowerCase() }