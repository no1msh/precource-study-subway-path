package racingcar

class RacingGame {
    val inputView = InputView()
    val outputView = OutputView()

    fun start() {
        val cars = getCarNames()
    }

    private fun getCarNames(): List<Car> {
        outputView.printRequestCarNames()
        inputView.getCarNames()
    }
}