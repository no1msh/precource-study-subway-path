package racingcar.errorcheck

import racingcar.RacingMessage
import racingcar.RacingParameter

object ErrorCheck {
    fun carListCheck(cars : String){
        val carlist = cars.split(",")
        for(count :Int in carlist.indices){
            require(carlist[count].length in RacingParameter.CAR_NAME_LENGTH_MINIMUN.number .. RacingParameter.CAR_NAME_LENGTH_MAXTIMUN.number){RacingMessage.ERROR_NAME_LENGTH}
        }
    }


}