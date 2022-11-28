package racingcar.domain

import racingcar.Car

class CarService {
    fun makeCars(carNames: List<String>): List<Car> {
        val cars: MutableList<Car> = mutableListOf()
        for (carName in carNames) {
            cars.add(Car(carName))
        }
        return cars
    }

    fun driving(cars: List<Car>) {
        for (car in cars) {
            car.drive()
            car.printResult()
        }
    }
}