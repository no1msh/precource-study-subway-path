package racingcar.controller

import racingcar.model.Car
import racingcar.domain.CarService
import racingcar.ui.View

class GameController {
    private val view = View()
    private val carService = CarService()

    fun play() {
        val carNames = getCarNames()
        val cars = initCars(carNames)
        val playCount = getPlayCount()
        gameStart(cars, playCount)
        gameEnd(cars)
    }

    private fun initCars(carNames: List<String>): List<Car> {
        return carService.makeCars(carNames)
    }

    private fun getCarNames(): List<String> = view.initView()

    private fun gameStart(cars: List<Car>, playCount: Int): List<Car> {
        view.resultView()
        for (i in 0 until playCount) {
            inGame(cars)
        }
        return cars
    }

    private fun getPlayCount(): Int = view.startView()

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