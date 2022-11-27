package racingcar.view.io

import racingcar.domain.racing.RacingLog
import racingcar.view.strings.Messages

object OutputView {

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

    fun printFinalWinner(names: List<String>) {
        println(Messages.FinalWinner.message.format(
            names.joinToString(", ")
        ))
    }
}