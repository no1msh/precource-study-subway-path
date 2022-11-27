package racingcar.view.io

import racingcar.domain.racing.RacingLog
import racingcar.view.strings.Messages

object OutputView {

    private const val ERROR_PREFIX = "[ERROR]"

    fun printInputCarNames() {
        println(Messages.InputCarNames)
    }

    fun printInputTryCount() {
        println(Messages.InputTryCount)
    }

    fun printGameResult() {
        println(Messages.GameResult)
    }

    fun printRacingLog(racingLog: RacingLog) {
        println(racingLog)
    }

    fun printFinalWinners(names: List<String>) {
        println(Messages.FinalWinner.message.format(
            names.joinToString(", ")
        ))
    }

    fun printError(e: IllegalArgumentException) {
        println("$ERROR_PREFIX ${e.message}")
    }
}