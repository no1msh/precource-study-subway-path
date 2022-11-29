package racingcar

import camp.nextstep.edu.missionutils.Randoms.pickUniqueNumbersInRange

class RacingGame {
    private val inputView = InputView()
    private val outputView = OutputView()

    fun start() {
        val cars = getCarNames()
        val gameCount = getGameCount()
        playGame(cars, gameCount)
    }

    private fun playGame(cars: List<Car>, gameCount: Int) {
        outputView.printResultMessage()
        for (i in 0 until gameCount) {
            moveCars(cars)
        }
    }

    private fun moveCars(cars: List<Car>) {
        val n = cars.size
        val random = pickUniqueNumbersInRange(0, 9, n)
        for (i in 0 until n) {
            if (random[i] >= 4) {
                cars[i].move()
            }
        }
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