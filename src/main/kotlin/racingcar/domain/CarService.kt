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

    fun compare(cars: List<Car>): MutableList<String> {
        val sortedCars = sortByPosition(cars)
        val result: MutableList<String> = mutableListOf()
        val winnerCondition = sortedCars[0].second
        sortedCars.forEach {
            if (it.second == winnerCondition) {
                result.add(it.first)
            }
        }
        return result
    }

    private fun sortByPosition(cars: List<Car>): MutableList<Pair<String, Int>> {
        val sortedCars: MutableList<Pair<String, Int>> = mutableListOf()
        for (car in cars) {
            sortedCars.add(car.getName() to car.getPosition())
        }
        sortedCars.sortByDescending { it.second }
        return sortedCars
    }
}