package racingcar

import racingcar.view.View

class RacingCarController {
    fun play() {
        val carNames = View.viewCarName()
        val cars = carNames.map { Car(it) }
    }



}