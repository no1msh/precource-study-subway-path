package racingcar.domain

import racingcar.Car

class CarService {
    fun make(carNames: List<String>): List<Car> {
        val cars: MutableList<Car> = mutableListOf()
        for (carName in carNames) {
            cars.add(Car(carName))
        }
        return cars
    }
}