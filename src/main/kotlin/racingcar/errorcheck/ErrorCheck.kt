package racingcar.errorcheck

import racingcar.RacingMessage
import racingcar.RacingParameter

object ErrorCheck {
    fun carListCheck(cars: String) {
        val carList = cars.split(RacingMessage.SPLIT_NO_SPACE.toString())
        for (count: Int in carList.indices) {
            require(carList[count].length in RacingParameter.CAR_NAME_LENGTH_MINIMUM.number..RacingParameter.CAR_NAME_LENGTH_MAXIMUM.number) { RacingMessage.ERROR_NAME_LENGTH }
        }
    }

    fun isItNumber(number: String) {
        require(number.toIntOrNull() != null) { RacingMessage.ERROR_COUNT_IS_NOT_NUMBER }
    }

    fun carNameDuplicateCheck(cars:List<String>){
        require(cars==cars.distinct()){ RacingMessage.ERROR_CAR_NAME_MUST_UNIQUE }
    }

}