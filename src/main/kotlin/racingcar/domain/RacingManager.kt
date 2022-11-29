package racingcar.domain

import racingcar.Car
import racingcar.IO.RacingInput
import racingcar.IO.RacingOutput
import racingcar.calculate.RacingCalculator
import kotlin.properties.Delegates

object RacingManager {
    lateinit var carList: MutableList<Car>
    var progressCount by Delegates.notNull<Int>()

    fun gameStart() {
        getCars()
        getCount()
        startRacing()
        printResult()
    }

    private fun getCars() {
        RacingOutput.giveMeCars()
        val cars = RacingInput.inputCar()
        carList = makeCarProgress(RacingCalculator.splitCarList(cars))
    }

    private fun makeCarProgress(cars: List<String>): MutableList<Car> = RacingCalculator.makeInitProgressList(cars)


    private fun getCount() {
        RacingOutput.giveMeCount()
        progressCount = RacingInput.getCount()
    }

    private fun startRacing() {

    }

    private fun printResult() {

    }

}