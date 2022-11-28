package racingcar

import camp.nextstep.edu.missionutils.Console.readLine

class InputView {
    private val exception = Exceptions()

    fun getCarNames() {
        do {
            val input = readLine()
            val cars = input.split(",")
        } while (exception.validateInputNames(cars))
    }

}