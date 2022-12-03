package service

import camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest
import camp.nextstep.edu.missionutils.test.NsTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import racingcar.main

internal class ExceptionHandlerTest: NsTest() {
    @Test
    fun `자동차 이름 입력 시 알파벳과 쉼표만 입력했는지 확인1`() {
        assertSimpleTest {
            runException("pobi,woni.jin")
            assertThat(output()).contains(Message.ERROR.toString())
        }
    }

    override fun runMain() {
        main()
    }
}