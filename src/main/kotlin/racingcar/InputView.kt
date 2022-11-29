package racingcar

import camp.nextstep.edu.missionutils.Console.readLine

class InputView {
    private val exception = Exceptions()

    fun getCarNames(): List<String> {
        var cars: List<String>
        do {
            var input = readLine()
            input = input.replace(" ","")
            cars = input.split(",")
        } while (exception.validateInputNames(cars))
        return cars
    }

    fun getGameCount(): Int {
        var input: String
        do {
            input = readLine()
        } while (exception.validateGameCount(input))
        return input.toInt()
    }

}