package racingcar.util

fun String.isUpperOrLower(): Boolean = all { it.isUpperCase() || it.isLowerCase() }