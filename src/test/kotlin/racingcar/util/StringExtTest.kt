package racingcar.util

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

internal class StringExtTest {

    @ParameterizedTest
    @ValueSource(strings = [
        "123", "0", "-24",
        Int.MAX_VALUE.toString(), Int.MIN_VALUE.toString(),
    ])
    fun `toIntOrThrow_숫자_정상`(text: String) {
        assertThat(text.toIntOrThrow()).isEqualTo(text.toInt())
    }

    @ParameterizedTest
    @ValueSource(strings = [
        "a", "ㄱ",
        "10a", "10.0", "10,0", "11-0", "1 0", "10 ",
        Long.MIN_VALUE.toString(), Long.MAX_VALUE.toString()
    ])
    fun `toIntOrThrow_에러`(text: String) {
        assertThrows<IllegalArgumentException> {
            text.toIntOrThrow()
        }
    }

    @ParameterizedTest
    @ValueSource(strings = ["a", "B", "AbzeEFjwi"])
    fun `isUpperOrLower_영대소문자_true`(text: String) {
        assertThat(text.isUpperOrLower()).isEqualTo(true)
    }

    @ParameterizedTest
    @ValueSource(strings = ["테스트", "aㄱ", "a.b", "a b", "a-b", ""])
    fun `isUpperOrLower_예외문자_false`(text: String) {
        assertThat(text.isUpperOrLower()).isEqualTo(false)
    }
}