package racingcar

import racingcar.domain.racing.RacingGame
import racingcar.view.View
import racingcar.view.io.InputView
import racingcar.view.io.OutputView

fun main() {
    val game = RacingGame(createView())
    game.play()
}

private fun createView(): View {
    return View(InputView(), OutputView())
}