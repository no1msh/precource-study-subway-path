package racingcar.domain

import racingcar.model.Car

class CarService {
    fun makeCars(carNames: List<String>): List<Car> {
        val cars: MutableList<Car> = mutableListOf()
        for (carName in carNames) {
            cars.add(Car(carName))
        }
        return cars
    }

    fun driving(car: Car) {
        car.drive()
    }
}