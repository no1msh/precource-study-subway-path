package racingcar.ui

class View {
    private val inputView = InputView()
    private val outputView = OutputView()

    fun initView(): List<String> {
        outputView.printInit()
        return inputView.retryReadCarName()
    }

    fun startView(): Int {
        outputView.printPlayCount()
        return inputView.retryReadPlayCount()
    }

    fun endView(winners: List<String>) {
        outputView.printWinner(winners)
    }
}