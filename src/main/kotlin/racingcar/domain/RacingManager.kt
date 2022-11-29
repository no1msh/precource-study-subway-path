package racingcar.domain

import racingcar.Car
import racingcar.interact.RacingInput
import racingcar.interact.RacingOutput
import racingcar.RacingParameter
import racingcar.calculate.RacingCalculator
import kotlin.properties.Delegates

object RacingManager {
    private lateinit var carList: MutableList<Car>
    private var progressCount by Delegates.notNull<Int>()

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
        RacingOutput.printProgressMessage()
        for (count: Int in RacingParameter.START_COUNT.number until progressCount) {
            val moving = RacingCalculator.progressRandom(carList)
            for (number: Int in carList.indices) {
                carList[number].doIMoving(moving[number])
            }
            RacingOutput.printRacing(carList)
        }
    }

    private fun printResult() {
        RacingOutput.printWinner(RacingCalculator.getWinner(carList))
    }

}