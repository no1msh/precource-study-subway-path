package racingcar.interact

import racingcar.Car
import racingcar.RacingMessage
import racingcar.RacingParameter
import racingcar.calculate.RacingCalculator

object RacingOutput {

    fun giveMeCars() {
        println(RacingMessage.GIVE_ME_CAR_LIST)
    }

    fun giveMeCount() {
        println(RacingMessage.HOW_MANY_COUNT)
    }

    fun printRacing(cars : MutableList<Car>){
        for(count : Int in cars.indices){
            println(cars[count].printProgress())
        }
        println(RacingMessage.EMPTY)
    }

    fun printwinner(cars : MutableList<Car>){
        val winners = mutableListOf<Car>()
        winners.add(cars[RacingParameter.START_COUNT.number])

    }

}