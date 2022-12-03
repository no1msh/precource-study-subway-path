package domain

import camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest
import camp.nextstep.edu.missionutils.test.NsTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import racingcar.main

internal class CarManagerTest : NsTest() {
//    @Test
//    fun `자동차 생성 테스트1`() {
//        assertSimpleTest{
//            run("pobi,jun,jin")
//            assertThat(output().contains(""))
//        }
//    }

    @Test
    fun `자동차 이름 및 시도 횟수 입력 테스트`() {
        assertSimpleTest{
            run("pobi,asd", "3")
            assertThat(output().contains(""))
        }
    }

    override fun runMain() {
        main()
    }
}