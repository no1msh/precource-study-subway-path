package racingcar

import racingcar.view.OutputView

class Exceptions {
    private val outputView = OutputView()

    fun validateInputNames(input: List<String>): Boolean {
        if (validateCarCount(input) || validateInputSize(input) || validateInputDuplicate(input))
            return true
        return false
    }

    private fun validateCarCount(input: List<String>): Boolean {
        try {
            require(input.size > INPUT_SIZE)
        } catch (e: IllegalArgumentException) {
            outputView.printInputSizeError()
            return true
        }
        return false
    }

    private fun validateInputDuplicate(input: List<String>): Boolean {
        try {
            require(input.all { it.length <= INPUT_LENGTH })
        } catch (e: IllegalArgumentException) {
            outputView.printInputLengthError()
            return true
        }
        return false
    }

    private fun validateInputSize(input: List<String>): Boolean {
        try {
            require(input.size == input.distinct().size)
        } catch (e: IllegalArgumentException) {
            outputView.printInputDuplicateError()
            return true
        }
        return false
    }

    fun validateGameCount(input: String): Boolean {
        if (validateInputNumber(input))
            return true
        if (validateRangeNumber(input.toInt()))
            return true
        return false
    }

    private fun validateInputNumber(input: String): Boolean {
        val num = input.toIntOrNull()
        try {
            require(num != null)
        } catch (e: IllegalArgumentException) {
            outputView.printInputNumberError()
            return true
        }
        return false
    }

    private fun validateRangeNumber(input: Int): Boolean {
        try {
            require(input >= INPUT_SIZE)
        } catch (e: IllegalArgumentException) {
            outputView.printInputRangeError()
            return true
        }
        return false
    }

    companion object {
        const val INPUT_LENGTH = 5
        const val INPUT_SIZE = 1
    }
}