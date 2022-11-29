package racingcar.interact

import camp.nextstep.edu.missionutils.Console
import racingcar.errorcheck.ErrorCheck

object RacingInput {
    fun inputCar(): String {
        var check = false
        var cars = ""
        while (!check) {
            try {
                cars = Console.readLine()
                ErrorCheck.carListCheck(cars)
                check = true
            } catch (error: IllegalArgumentException) {
                println(error.message)
            }
        }
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