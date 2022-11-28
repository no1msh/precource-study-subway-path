package racingcar

class OutputView {
    fun printRequestCarNames() {
        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    }

    fun printInputDuplicateError() {
        println(ERROR_MESSAGE + DUPLICATE_NAME_MESSAGE + REQUEST_RETRY_MESSAGE)
    }

    fun printInputLengthError() {
        println(ERROR_MESSAGE + WRONG_SIZE_NAME_MESSAGE + REQUEST_RETRY_MESSAGE)
    }

    companion object {
        const val ERROR_MESSAGE = "[ERROR] "
        const val DUPLICATE_NAME_MESSAGE = "자동차 이름은 중복될 수 없습니다."
        const val WRONG_SIZE_NAME_MESSAGE = "자동차 이름은 5글자 이하여야 합니다."
        const val REQUEST_RETRY_MESSAGE = " 다시 입력해주세요."
    }

}