package racingcar

import racingcar.domain.Car
import racingcar.domain.Referee
import racingcar.view.View

class RacingCarController {
    fun play() {
        val cars = createCars()
        moveAllCar(cars)
        val winners = Referee().getWinners(cars)
        View.result(cars, winners)
    }

    private fun createCars(): List<Car> {
        val carNames = View.carName()
        return carNames.map { Car(it) }
    }

    private fun moveAllCar(cars: List<Car>) {
        val attemptsNumber = View.attemptsNumber()
        cars.forEach { it.move(attemptsNumber) }
    }

}