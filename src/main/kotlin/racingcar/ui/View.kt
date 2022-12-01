package racingcar.ui

import racingcar.model.Car

class View {
    private val inputView = InputView()
    private val outputView = OutputView()

    fun initView(): List<String> {
        outputView.printInit()
        return inputView.readCarName()
    }

    fun startView(): Int {
        outputView.printPlayCount()
        return inputView.readPlayCount()
    }

    fun stepView(car: Car) {
        outputView.printStep(car.getPosition(), car.getName())
        println()
    }

    fun resultView() {
        outputView.printResult()
    }

    fun endView(winners: List<String>) {
        outputView.printWinner(winners)
    }
}