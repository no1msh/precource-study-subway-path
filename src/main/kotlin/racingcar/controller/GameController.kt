package racingcar.controller

import racingcar.model.Car
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
            inGame(cars)
            println()
        }
        return cars
    }

    private fun inGame(cars: List<Car>) {
        for (car in cars) {
            carService.driving(car)
            view.stepView(car)
        }
    }

    private fun gameEnd(cars: List<Car>) {
        val winners = Car.compare(cars)
        view.endView(winners)
    }
}