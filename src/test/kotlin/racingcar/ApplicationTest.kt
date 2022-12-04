package racingcar

import camp.nextstep.edu.missionutils.test.Assertions
import camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest
import camp.nextstep.edu.missionutils.test.NsTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApplicationTest : NsTest() {
    @Test
    fun `전진_정지`() {
        Assertions.assertRandomNumberInRangeTest(
            {
                run("pobi,woni", "1")
                assertThat(output()).contains("pobi : -", "woni : ", "최종 우승자 : pobi")
            },
            MOVING_FORWARD, STOP
        )
    }

    @Test
    fun `동점자가 존재하는 경우 테스트`() {
        Assertions.assertRandomNumberInRangeTest(
            {
                run("pobi,woni,yerin", "1")
                assertThat(output()).contains("pobi : -", "woni : ", "yerin : -", "최종 우승자 : pobi, yerin")
            },
            MOVING_FORWARD, STOP, MOVING_FORWARD
        )
    }

    @Test
    fun 이름에_대한_예외_처리() {
        assertSimpleTest {
            runException("pobi,javaji")
            assertThat(output()).contains(ERROR_MESSAGE)
        }
    }

    public override fun runMain() {
        main()
    }

    companion object {
        private const val MOVING_FORWARD = 4
        private const val STOP = 3
        private const val ERROR_MESSAGE = "[ERROR]"
    }
}
