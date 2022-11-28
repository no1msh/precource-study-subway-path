package racingcar

import camp.nextstep.edu.missionutils.Console.readLine

class InputView {
    private val exception = Exceptions()

    fun getCarNames(): List<String> {
        var cars: List<String>
        do {
            val input = readLine()
            input.replace(" ","")
            cars = input.split(",")
        } while (exception.validateInputNames(cars))
        return cars
    }

}