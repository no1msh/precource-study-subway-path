package racingcar.IO

import camp.nextstep.edu.missionutils.Console

object RacingInput {
    fun inputCar(): String {
        var check = false
        var cars = ""
        while (!check) {
            try {
                val cars = Console.readLine()
                //에러체크
                check = true
            } catch (error: IllegalArgumentException) {
                println(error.message)
            }
        }
        return cars
    }


}