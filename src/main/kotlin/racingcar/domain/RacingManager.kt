package racingcar.domain

import racingcar.IO.RacingInput
import racingcar.IO.RacingOutput
import racingcar.calculate.RacingCalculater

object RacingManager {
    lateinit var carList: List<String>
    lateinit var carProgress: MutableList<Int>

    fun gameStart() {
        getCars()

    }

    private fun getCars() {
        RacingOutput.giveMeCars()
        val cars = RacingInput.inputCar()
        carList = RacingCalculater.splitCarList(cars)
        makeCarProgress()
    }

    private fun makeCarProgress() {
        carProgress=RacingCalculater.makeInitProgressList(carList)
    }


}