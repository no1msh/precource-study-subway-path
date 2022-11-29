package racingcar.interact

import camp.nextstep.edu.missionutils.Console
import racingcar.RacingMessage
import racingcar.errorcheck.ErrorCheck

object RacingInput {
    fun inputCar(): String {
        var check = false
        var cars:String = RacingMessage.EMPTY.toString()
        while (!check) {
            try {
                cars=getCars()
                check= true
            } catch (error: IllegalArgumentException) {
                println(error.message)
            }
        }
        return cars
    }

    private fun getCars():String{
        var cars: String = Console.readLine()
        cars = cars.replace(RacingMessage.SPACE.toString(),RacingMessage.EMPTY.toString())
        ErrorCheck.carListCheck(cars)
        ErrorCheck.carNameDuplicateCheck(cars.split(RacingMessage.SPLIT_NO_SPACE.toString()))
        return cars
    }

    fun getCount(): Int {
        while (true) {
            try {
                val count = Console.readLine()
                ErrorCheck.isItNumber(count)
                return count.toInt()
            } catch (error: IllegalArgumentException) {
                println(error.message)
            }
        }
    }


}