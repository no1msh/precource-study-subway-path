package racingcar.view

import racingcar.domain.racing.RacingLog
import racingcar.view.io.InputView
import racingcar.view.io.OutputView
import racingcar.util.repeatIfThrows

object View {

    fun requestRacingCarNames(): List<String> {
        OutputView.printInputCarNames()

        return repeatIfThrows(
            tryBlock = InputView::readRacingCarNames,
            catchBlock = OutputView::printError,
        )
    }

    fun requestRacingTryCount(): Int {
        OutputView.printInputTryCount()

        return repeatIfThrows(
            tryBlock = InputView::readTryCount,
            catchBlock = OutputView::printError,
        )
    }

    fun printGameResult() {
        OutputView.printGameResult()
    }

    fun printRacingLog(log: RacingLog) {
        OutputView.printRacingLog(log)
    }

    fun printFinalWinners(names: List<String>) {
        OutputView.printFinalWinners(names)
    }
}