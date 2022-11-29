package racingcar.interact

import racingcar.Car
import racingcar.RacingMessage
import racingcar.RacingParameter

object RacingOutput {

    fun giveMeCars() {
        println(RacingMessage.GIVE_ME_CAR_LIST)
    }

    fun giveMeCount() {
        println(RacingMessage.HOW_MANY_COUNT)
    }

    fun printProgressMessage() {
        println(RacingMessage.RESULT_ON_THE_WAY)
    }

    fun printRacing(cars: MutableList<Car>) {
        for (count: Int in cars.indices) {
            println(cars[count].printProgress())
        }
        println(RacingMessage.EMPTY)
    }

    fun printwinner(cars: MutableList<Car>) {
        print(RacingMessage.RESULT_WINNER)
        for (count: Int in RacingParameter.START_COUNT.number until cars.size) {
            if (count != RacingParameter.START_COUNT.number)
                print(RacingMessage.SPLIT)
            print(cars[count].getName())
        }
        println(RacingMessage.EMPTY)
    }

}