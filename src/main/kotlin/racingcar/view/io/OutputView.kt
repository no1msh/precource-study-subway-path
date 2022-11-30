package racingcar.view.io

import racingcar.model.racing.RacingLog
import racingcar.view.strings.Messages

class OutputView {

    fun printInputCarNames() {
        println(Messages.InputCarNames)
    }

    fun printInputTryCount() {
        println(Messages.InputTryCount)
    }

    fun printGameResult(logs: List<RacingLog>) {
        println(Messages.GameResult)
        println(buildGameResult(logs))
    }

    private fun buildGameResult(logs: List<RacingLog>): String = buildString {
        for (i in logs[0].record.indices) {
            for (log in logs) {
                appendLine(buildGameResultOf(log, i))
            }
            appendLine()
        }
    }

    private fun buildGameResultOf(log: RacingLog, round: Int): String {
        return "${log.carName} : ${(1..log.record[round]).joinToString(separator = "") { STEP }}"
    }

    fun printFinalWinners(names: List<String>) {
        println(Messages.FinalWinner.message.format(
            names.joinToString(", ")
        ))
    }

    fun printError(e: IllegalArgumentException) {
        println("$ERROR_PREFIX ${e.message}")
    }

    companion object {
        private const val ERROR_PREFIX = "[ERROR]"
        private const val STEP = "-"
    }
}