package racingcar.calculate

import racingcar.Car
import racingcar.RacingParameter

object RacingCalculater {

    fun splitCarList(cars: String): List<String> = cars.split(",")
    fun makeInitProgressList(cars: List<String>): MutableList<Car> {
        val carProgress = mutableListOf<Car>()
        for(count: Int in RacingParameter.START_COUNT.number .. cars.size)
            carProgress.add(Car(cars[count]))
        return carProgress
    }


}