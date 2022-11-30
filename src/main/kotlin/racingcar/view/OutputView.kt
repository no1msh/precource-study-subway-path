package racingcar.view

import racingcar.domain.Car

const val ERROR = "[ERROR]"


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
