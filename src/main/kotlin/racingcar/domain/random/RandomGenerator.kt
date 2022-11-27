package racingcar.domain.random

interface RandomGenerator {
    fun generate(startInclusive: Int, endInclusive: Int): Int
}