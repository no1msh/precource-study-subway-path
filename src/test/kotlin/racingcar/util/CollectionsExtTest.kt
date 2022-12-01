package racingcar.util

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionsExtTest {

    @Test
    fun `maxAll_테스트`() {
        val test = listOf(6, 7, 1, 8, 2, 3, 3, 8, 1, 8).maxAll()
        val answer = listOf(8, 8, 8)
        assertThat(test).containsExactlyElementsOf(answer)
    }
}