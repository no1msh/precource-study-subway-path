package racingcar.view

import camp.nextstep.edu.missionutils.Console

object InputView {
    fun inputCars(): List<String> {
        val userInputCars = Console.readLine()
        return userInputCars.split(",")
    }

    fun inputCount(): String = Console.readLine()
}