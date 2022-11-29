package racingcar.domain

import racingcar.IO.RacingInput
import racingcar.IO.RacingOutput

object RacingManager {

    fun gameStart() {

    }

    fun getCars() {
        RacingOutput.giveMeCars()
        val cars = RacingInput.inputCar()
    }


}