package racingcar.ui

import racingcar.enums.GameMessages

class OutputView {

    fun printInit() = println(GameMessages.START.toString())

    fun printPlayCount() = println(GameMessages.PLAY_COUNT.toString())

    fun printResult() = println(GameMessages.RESULT.toString())

    fun printWinner() {

    }
}