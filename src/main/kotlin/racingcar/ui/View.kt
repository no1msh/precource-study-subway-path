package racingcar.ui

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

    fun endView(winners: List<String>) {
        println("${outputView.printWinner()} ${winners.joinToString { ", " }}")
    }
}