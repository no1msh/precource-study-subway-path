package racingcar.view.io

import racingcar.domain.racing.Car
import racingcar.domain.racing.RacingTrack
import racingcar.util.isUpperOrLower
import racingcar.view.strings.ErrorMessages

object InputValidator {

    fun checkCarNames(names: List<String>) {
        require(names.size in RacingTrack.AvailableCarSize) { ErrorMessages.OutOfCarSize }
        require(names.all { it.length in Car.AvailableNameLength }) { ErrorMessages.OutOfCarNameLength }
        require(names.all { it.isUpperOrLower() }) { ErrorMessages.InvalidCarName }
    }
}