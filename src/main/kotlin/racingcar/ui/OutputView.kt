package racingcar.ui

import racingcar.enums.GameMessages

class OutputView {

    fun printInit() = println(GameMessages.START.toString())

    fun printPlayCount() = println(GameMessages.PLAY_COUNT.toString())

    fun printStep(position: Int, name: String) {
        var distance = ""
        for (i in 0 until position) {
            distance += "-"
        }
        println("$name : $distance")
    }

    fun printResult() = println(GameMessages.RESULT.toString())

    fun printWinner(winners: List<String>) {
        println(winners.joinToString(SEPARATOR, PREFIX))
    }

    companion object {
        private const val SEPARATOR = ", "
        private val PREFIX = GameMessages.WINNER.toString()
    }
}