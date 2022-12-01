package racingcar.controller

import racingcar.model.Car
import racingcar.model.Racing
import racingcar.view.View

object RacingCarController {

    lateinit var racing: Racing
    lateinit var carList: List<Car>
    var maxCount = 0

    fun startRacing() {
        initRacing()
        race()
        raceEnd()
    }

    private fun initRacing() {
        val cars = View.requestCarNames()
        this.carList = initCars(cars)
        this.maxCount = View.requestCount().toInt()
        this.racing = Racing(carList)
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
            View.addTempResult(carList)
        }
        View.printTotalResult()
    }

    private fun raceEnd() {
        View.printWinner(getWinners())
    }

    private fun getWinners(): List<String> {
        val winners = mutableListOf<String>()
        for (car in carList) {
            if (car.getPosition() == maxCount) {
                winners.add(car.getName())
            }
        }
        return winners.toList()
    }
}