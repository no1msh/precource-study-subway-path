package racingcar.view.io

import camp.nextstep.edu.missionutils.Console
import racingcar.view.validator.InputValidator

class InputView {

    fun readRacingCarNames(): List<String> {
        val names = Console.readLine()
            .split(",")
            .filter { it.isNotBlank() }
            .map { it.trim() }

        InputValidator.checkRacingCarNames(names)

        return names
    }

    fun readTryCount(): Int {
        return InputValidator.validTryCount(Console.readLine())
    }
}