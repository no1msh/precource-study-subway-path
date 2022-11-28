package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CarTest {
    @Test
    fun `전진 함수 테스트`() {
        val car = Car("test")
        for (i in 0..5) {
            car.drive()
            car.printPosition()
            car.printResult()
        }
    }

    @Test
    fun `랜덤 숫자 생성 테스트`() {
        val car = Car("test")
        val number = car.pickNumber().also { println(it) }
    }
}