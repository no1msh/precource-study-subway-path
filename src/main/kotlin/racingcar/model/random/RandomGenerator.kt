package racingcar.model.random

interface RandomGenerator {
    fun generate(startInclusive: Int, endInclusive: Int): Int
}