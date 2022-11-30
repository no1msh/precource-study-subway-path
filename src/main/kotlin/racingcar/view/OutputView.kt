package racingcar.view

import racingcar.Car

const val ERROR = "[ERROR]"
const val RESULT_MESSAGE = "실행 결과\n"

object OutputView {
    fun printError(e: IllegalArgumentException) {
        println("$ERROR ${e.message}")
    }

    fun printResult(cars: List<Car>): String {
        return buildString {
            cars.forEach {
                append(it.getCarName())
                append(" : ")
                appendLine(drawMoveDistance(it.getPosition()))

            }
        }
    }

    private fun drawMoveDistance(position: Int): String = buildString {
        repeat(position) {
            append('-')
        }
    }

    fun printWinner(winners: List<String>): String = winners.joinToString(", ")
}
