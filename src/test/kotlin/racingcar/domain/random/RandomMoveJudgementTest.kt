package racingcar.domain.random

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class RandomMoveJudgementTest {

    @Test
    fun `자동차무작위이동테스트`() {
        val numbers = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val generator = RandomNumberGeneratorForTest(numbers)
        val randomMove = RandomMoveJudgement(generator)
        val answers = booleanArrayOf(false, false, false, false, true, true, true, true, true, true)

        answers.forEach {
            assertThat(randomMove.isMove()).isEqualTo(it)
        }
    }

    class RandomNumberGeneratorForTest(private val numbers: List<Int>) : RandomGenerator {

        private var order = 0

        override fun generate(startInclusive: Int, endInclusive: Int): Int {
            return numbers[(order++) % numbers.size]
        }
    }
}