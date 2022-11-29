package racingcar.calculate

import racingcar.Car
import racingcar.RacingParameter
import camp.nextstep.edu.missionutils.Randoms

object RacingCalculator {

    fun splitCarList(cars: String): List<String> = cars.split(",")
    fun makeInitProgressList(cars: List<String>): MutableList<Car> {
        val carProgress = mutableListOf<Car>()
        for (count: Int in RacingParameter.START_COUNT.number..cars.size)
            carProgress.add(Car(cars[count]))
        return carProgress
    }

    fun carMoving(): Boolean {
        val randomNumber = Randoms.pickUniqueNumbersInRange(
            RacingParameter.RANDOM_NUMBER_MINIMUM.number,
            RacingParameter.RANDOM_NUMBER_MAXIMUN.number,
            RacingParameter.HOW_MANY_GET_NUMBERS.number
        )
        return randomNumber[RacingParameter.START_COUNT.number] > RacingParameter.CAR_MOVING_MINIMUM_NUMBER.number
    }


}