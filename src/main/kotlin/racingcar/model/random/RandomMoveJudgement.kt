package racingcar.model.random

class RandomMoveJudgement(private val generator: RandomGenerator) {

    fun isMove(): Boolean {
        return generator.generate(START, END) >= PIVOT
    }

    companion object {
        private const val START = 0
        private const val END = 9
        private const val PIVOT = 4
    }
}