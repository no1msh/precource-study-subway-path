package racingcar.controller

import racingcar.Car
import racingcar.domain.CarService
import racingcar.ui.View

class GameController {
    private val view = View()
    private val carService = CarService()

    fun play() {
        val cars = initialize()
        gameStart(cars)
        gameEnd(cars)
    }

    private fun initialize(): List<Car> {
        val carNames = view.initView()
        return carService.makeCars(carNames)
    }

    private fun gameStart(cars: List<Car>): List<Car> {
        val playCount = view.startView()
        view.resultView()
        for (i in 0 until playCount) {
            carService.driving(cars)
            println()
        }
        return cars
    }

    private fun gameEnd(cars: List<Car>) {
        val winners = carService.compare(cars)
        view.endView(winners)
    }
}