package racingcar

class Exceptions {
    val outputView = OutputView()

    fun validateInputNames(input: List<String>): Boolean {
        require(input.size == input.distinct().size) {
            outputView.printInputDuplicateError()
            return true
        }
        require(input.all { it.length <= 5 }) {
            outputView.printInputLengthError()
            return true
        }
        return false
    }
}