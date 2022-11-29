package racingcar

import racingcar.calculate.RacingCalculator

class Car(private val name: String) {

    private var position: Int = 0

    fun getName(): String = name
    fun getProgress(): Int = position
    fun doIMoving() {
        if(RacingCalculator.carMoving())
            position++
    }

    fun printProgress():String = name + RacingCalculator.carProgress(position)
}
