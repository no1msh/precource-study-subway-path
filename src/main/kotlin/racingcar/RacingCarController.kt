package racingcar

import racingcar.domain.Car
import racingcar.domain.Referee
import racingcar.view.View

class RacingCarController {
    fun play() {
        val cars = createCars()
        val attemptsNumber = View.attemptsNumber()
        cars.forEach { it.move(attemptsNumber) }
        val winners = Referee(cars).getWinners()
        View.result(cars, winners)
    }

    private fun createCars(): List<Car> {
        val carNames = View.carName()
        return carNames.map { Car(it) }
    }


}