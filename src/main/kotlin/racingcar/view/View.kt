package racingcar.view

import racingcar.view.io.InputView
import racingcar.view.io.OutputView

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

    private inline fun <reified T : Throwable, R> repeatIfThrows(
        tryBlock: () -> R,
        catchBlock: (T) -> Any,
    ): R {
        while (true) {
            try {
                return tryBlock()
            } catch (t: Throwable) {
                if (t !is T) throw t
                catchBlock(t)
            }
        }
    }
}