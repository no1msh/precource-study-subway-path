package view

import camp.nextstep.edu.missionutils.Console
import service.ExceptionHandler

class InputView {
    fun requireCarNames(): String {
        val carNames = Console.readLine()
        ExceptionHandler.checkNames(carNames)
        val names = carNames.split(",")
        isValidLength(names)
        return carNames
    }

    fun isValidLength(names: List<String>){
        for(name in names){
            ExceptionHandler.checkNameLength(name)
        }
    }
}