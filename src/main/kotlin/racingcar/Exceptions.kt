package racingcar

class Exceptions {
    private val outputView = OutputView()

    fun validateInputNames(input: List<String>): Boolean {
        if (validateInputSize(input) || validateInputDuplicate(input))
            return true
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

    private fun validateInputSize(input: List<String>): Boolean{
        try {
            require(input.size == input.distinct().size)
        } catch (e: IllegalArgumentException) {
            outputView.printInputDuplicateError()
            return true
        }
        return false
    }
}