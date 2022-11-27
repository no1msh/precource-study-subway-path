package racingcar.view.strings

import racingcar.domain.racing.Car
import racingcar.domain.racing.RacingGame
import racingcar.domain.racing.RacingTrack

enum class ErrorMessages(val message: String) {

    OutOfCarSize("자동차는 최소 ${RacingTrack.CAR_SIZE_MIN}대 이상 ${RacingTrack.CAR_SIZE_MAX}대 이하여야 합니다."),
    OutOfCarNameLength("각 자동차 이름의 길이는 ${Car.AvailableNameLength} 이어야 합니다."),
    OutOfTryCountRange("시도 횟수는 ${RacingGame.AvailableTryCountRange} 사이의 값이어야 합니다."),
    InvalidCarName("각 자동차의 이름은 영대/소문자만 가능합니다."),
    InvalidNumberFormat("시도 횟수는 숫자여야 합니다."),;

    override fun toString(): String = message
}