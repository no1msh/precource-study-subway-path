package view

import camp.nextstep.edu.missionutils.Console
import service.ExceptionHandler

class InputView {
    fun requireCarNames(): String {
        val carNames = Console.readLine()
        ExceptionHandler.checkNames(carNames)
        return carNames
    }
}