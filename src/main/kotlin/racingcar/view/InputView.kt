package racingcar.view

import camp.nextstep.edu.missionutils.Console

object InputView {
    fun readCarName(): List<String> {
        return Console.readLine().split(",")
    }

    fun readAttemptsNumber(): Int {
        return Console.readLine().toIntOrThrow()
    }

}

fun String.toIntOrThrow(): Int = requireNotNull(toIntOrNull())
