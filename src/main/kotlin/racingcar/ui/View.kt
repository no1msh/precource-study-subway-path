package racingcar.ui

class View {
    private val inputView = InputView()
    private val outputView = OutputView()

    fun startView(): List<String> {
        outputView.printStart()
        return inputView.readCarName()
    }
}