package racingcar.domain

import racingcar.IO.RacingInput
import racingcar.IO.RacingOutput
import racingcar.calculate.RacingCalculater

object RacingManager {
    lateinit var carList:List<String>
    lateinit var carProgress:List<Int>

    fun gameStart() {

    }

    fun getCars() {
        RacingOutput.giveMeCars()
        val cars = RacingInput.inputCar()
        carList=RacingCalculater.splitCarList(cars)
    }


}