package racingcar.ui

import camp.nextstep.edu.missionutils.Console
import racingcar.enums.ErrorMessages

class InputView {
    tailrec fun readCarName(): List<String> {
        val carNames = Console.readLine().trim().split(",")
        return try {
            validateCarNames(carNames)
            carNames
        } catch (e: IllegalArgumentException) {
            println(e.message)
            readCarName()
        }
    }

    private fun validateCarNames(carNames: List<String>) {
        require(carNames.all { it.length <= 5 }) {
            ErrorMessages.LENGTH_EXCEPTION.toString()
        }
        require(carNames.distinct().count() == carNames.size) {
            ErrorMessages.DISTINCT_EXCEPTION.toString()
        }
    }

    tailrec fun readPlayCount(): Int {
        val playCount = Console.readLine().trim()
        return try {
            validatePlayCount(playCount)
            playCount.toInt()
        } catch (e: IllegalArgumentException) {
            println(e.message)
            readPlayCount()
        }
    }

    private fun validatePlayCount(playCount: String) {
        require(playCount.all { it.isDigit() }){
            ErrorMessages.DIGIT_EXCEPTION.toString()
        }
    }
}