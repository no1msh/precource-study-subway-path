package racingcar

class RacingGame {
    private val inputView = InputView()
    private val outputView = OutputView()

    fun start() {
        val cars = getCarNames()
        val gameCount = getGameCount()
    }

    private fun getCarNames(): List<Car> {
        outputView.printRequestCarNames()
        val names = inputView.getCarNames()
        return toCar(names)
    }

    private fun toCar(names: List<String>): List<Car> {
        val cars = mutableListOf<Car>()
        for (name in names) {
            cars.add(Car(name))
        }
        return cars
    }

    private fun getGameCount(): Int {
        outputView.printRequestGameCount()
        return inputView.getGameCount()
    }

}