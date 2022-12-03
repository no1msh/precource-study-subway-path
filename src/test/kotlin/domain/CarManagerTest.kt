package domain

import camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest
import camp.nextstep.edu.missionutils.test.NsTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import racingcar.main

internal class CarManagerTest : NsTest() {
    @Test
    fun `자동차 생성 테스트1`() {
        assertSimpleTest{
            run("pobi,jun,jin")
            assertThat(output().contains(""))
        }
    }

    override fun runMain() {
        main()
    }
}