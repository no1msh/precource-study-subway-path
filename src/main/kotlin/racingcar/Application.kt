package racingcar

import racingcar.controller.RacingGameController
import racingcar.view.View
import racingcar.view.io.InputView
import racingcar.view.io.OutputView

fun main() {
    val controller = RacingGameController(createView())
    controller.execute()
}

private fun createView(): View {
    return View(InputView(), OutputView())
}