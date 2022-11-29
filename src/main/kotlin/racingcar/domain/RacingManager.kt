package racingcar.domain

import racingcar.Car
import racingcar.interact.RacingInput
import racingcar.interact.RacingOutput
import racingcar.RacingParameter
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
        RacingOutput.printProgressMessage()
        for (count: Int in RacingParameter.START_COUNT.number until progressCount) {
            for (number: Int in carList.indices) {
                carList[number].doIMoving()
            }
            RacingOutput.printRacing(carList)
        }
    }

    private fun printResult() {
        RacingOutput.printwinner(RacingCalculator.getWinner(carList))
    }

}