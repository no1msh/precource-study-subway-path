package racingcar.view

import racingcar.model.Car

object View {

    private var totalResult = StringBuilder()

    fun requestCarNames(): String {
        UI.printRequestInputCarName()
        return InputView.inputCars()
    }

    fun requestCount(): String {
        UI.printRequestInputCount()
        return InputView.inputCount()
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