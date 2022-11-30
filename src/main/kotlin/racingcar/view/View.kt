package racingcar.view

import racingcar.model.racing.RacingLog
import racingcar.view.io.InputView
import racingcar.view.io.OutputView
import racingcar.util.repeatIfThrows

class View(
    private val inputView: InputView,
    private val outputView: OutputView,
) {

    fun requestRacingCarNames(): List<String> {
        outputView.printInputCarNames()

        return repeatIfThrows(
            tryBlock = inputView::readRacingCarNames,
            catchBlock = outputView::printError,
        )
    }

    fun requestRacingTryCount(): Int {
        outputView.printInputTryCount()

        return repeatIfThrows(
            tryBlock = inputView::readTryCount,
            catchBlock = outputView::printError,
        )
    }

    fun printGameResult(logs: List<RacingLog>) {
        outputView.printGameResult(logs)
    }

    fun printFinalWinners(names: List<String>) {
        outputView.printFinalWinners(names)
    }

}