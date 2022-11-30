package racingcar.exceptions


import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class ExceptionHandlerTest{
    @Test
    fun `checkSize`() {
        assertThrows<IllegalArgumentException> {
            ExceptionHandler.checkCarName(listOf("aaaaaa","aaa"))
        }
    }

}