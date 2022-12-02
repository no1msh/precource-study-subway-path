package racingcar.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CarTest {

    @Test
    fun moveTest() {
        val testCar = Car("moon")
        testCar.move()
        assertThat(testCar.getPosition()).isEqualTo(1)
    }
}