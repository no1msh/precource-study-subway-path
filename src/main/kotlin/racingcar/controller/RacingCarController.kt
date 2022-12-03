package racingcar.controller

import racingcar.model.Car
import racingcar.model.Racing
import racingcar.view.View

object RacingCarController {

    lateinit var racing: Racing
    lateinit var cars: List<Car>
    private var maxCount = 0

    fun startRacing() {
        initRacing()
        race()
        raceEnd()
    }

    private fun initRacing() {
        val carNames = View.requestCarNames()
        this.cars = initCars(carNames)
        this.maxCount = View.requestCount().toInt()
        this.racing = Racing(cars)
    }

    private fun initCars(carNames: String): List<Car> {
        val cars = carNames.split(",")
        val carList = mutableListOf<Car>()
        for (carName in cars) {
            carList.add(Car(carName))
        }
        return carList.toList()
    }

    private fun race() {
        for (index in 0 until maxCount) {
            racing.raceOnce()
            View.addTempResult(cars)
        }
        View.printTotalResult()
    }

    private fun raceEnd() {
        View.printWinner(racing.getWinners(maxCount))
    }
}