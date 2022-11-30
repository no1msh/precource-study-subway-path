package racingcar.view

import camp.nextstep.edu.missionutils.Console
import racingcar.ExceptionHandler.checkCarName
import racingcar.ExceptionHandler.toIntOrThrow

object InputView {
    fun readCarName(): List<String> {
        val carNames = Console.readLine().split(",")
        checkCarName(carNames)
        return carNames
    }

    fun readAttemptsNumber(): Int {
        return Console.readLine().toIntOrThrow()
    }

}


