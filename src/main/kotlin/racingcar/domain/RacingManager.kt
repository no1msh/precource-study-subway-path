package racingcar.domain

import racingcar.Car
import racingcar.IO.RacingInput
import racingcar.IO.RacingOutput
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
        for(count:Int in RacingParameter.START_COUNT.number .. progressCount){
            for(number:Int in carList.indices){
                carList[number].doIMoving()
            }
            //output으로 결과 출력.
        }
    }

    private fun printResult() {

    }

}