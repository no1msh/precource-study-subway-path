package racingcar.view

import racingcar.exceptions.ValidationUserInput
import racingcar.model.Car

object View {

    private var totalResult = StringBuilder()

    fun requestCarNames(): String {
        var carNames = ""
        UI.printRequestInputCarName()
        try {
            carNames = InputView.inputCars()
            ValidationUserInput.validateCarNames(carNames)
        } catch (e: Exception) {
            println(e.message)
            UI.printRequestInputCarName()
            carNames = InputView.inputCars()
        }
        return carNames
    }

    fun requestCount(): String {
        var count = ""
        UI.printRequestInputCount()
        try {
            count = InputView.inputCount()
            ValidationUserInput.validateCount(count)
        } catch (e: Exception) {
            println(e.message)
            UI.printRequestInputCount()
            count = InputView.inputCount()
        }
        return count
    }

    fun printTotalResult() {
        println()
        UI.printResult()
        print(totalResult)
    }

    fun addTempResult(cars: List<Car>) {
        totalResult.append(OutputView.getTempResult(cars))
    }

    fun printWinner(winners: List<String>) {
        val finalWinners = StringBuilder()
        finalWinners.append("최종 우승자 : ")
            .append(OutputView.getWinner(winners))
        println(finalWinners.toString())
    }
}