package racingcar.IO

import racingcar.RacingMessage

object RacingOutput {

    fun giveMeCars() {
        println(RacingMessage.GIVE_ME_CAR_LIST)
    }

    fun giveMeCount(){
        println(RacingMessage.HOW_MANY_COUNT)
    }


}