package racingcar.view.io

import camp.nextstep.edu.missionutils.Console

object InputView {

    fun readCarNames(): List<String> {
        val names = Console.readLine()
            .split(",")
            .filter { it.isNotBlank() }
            .map { it.trim() }

        InputValidator.checkCarNames(names)

        return names
    }
}