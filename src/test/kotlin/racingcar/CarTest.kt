package racingcar

import org.junit.jupiter.api.Test
import racingcar.model.Car

internal class CarTest {

    @Test
    fun `랜덤 숫자 생성 테스트`() {
        val car = Car("test")
        car.pickNumber().also { println(it) }
    }
}