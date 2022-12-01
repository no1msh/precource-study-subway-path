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
            require(input.size > 1)
        } catch (e: IllegalArgumentException) {
            outputView.printInputSizeError()
            return true
        }
        return false
    }

    private fun validateInputDuplicate(input: List<String>): Boolean {
        try {
            require(input.all { it.length <= 5 })
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
            require(input > 0)
        } catch (e: IllegalArgumentException) {
            outputView.printInputRangeError()
            return true
        }
        return false
    }

}