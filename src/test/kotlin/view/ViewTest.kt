package view

import camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest
import camp.nextstep.edu.missionutils.test.NsTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import racingcar.main
import service.Message

internal class ViewTest : NsTest(){
    @Test
    fun `입력 테스트1`(){
        assertSimpleTest{
            run("pobi,test,jun")
            assertThat(output().contains("pobi"))
        }
    }

    @Test
    fun `입력 테스트2`(){
        assertSimpleTest{
            run("pobi.test,jun")
            assertThat(output().contains(Message.ERROR.toString()))
        }
    }

    @Test
    fun `입력 테스트3`(){
        assertSimpleTest{
            run("pobi,testtest,jun")
            assertThat(output().contains(Message.ERROR.toString()))
        }
    }

    override fun runMain() {
        main()
    }
}