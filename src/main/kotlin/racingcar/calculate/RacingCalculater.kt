package racingcar.calculate

import racingcar.RacingParameter

object RacingCalculater {

    fun splitCarList(cars: String): List<String> = cars.split(",")
    fun makeInitProgressList(cars: List<String>): MutableList<Int> {
        val carProgress = mutableListOf<Int>()
        for(count: Int in RacingParameter.START_COUNT.number .. cars.size)
            carProgress.add(RacingParameter.START_COUNT.number)
        return carProgress
    }


}