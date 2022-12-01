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

    fun printRequestGameCount() {
        println(REQUEST_GAME_COUNT_MESSAGE)
    }

    fun printInputNumberError() {
        println(ERROR_MESSAGE + WRONG_NUMBER_FORMAT_MESSAGE)
    }

    fun printInputRangeError() {
        println(ERROR_MESSAGE + WRONG_NUMBER_RANGE_MESSAGE)
    }

    fun printResultMessage() {
        println(RESULT_MESSAGE)
    }

    fun printResultCars(cars: List<Car>) {
        for (car in cars) {
            println(car.result())
        }
        println()
    }

    fun printWinner(winner: List<String>) {
        println(RESULT_WINNER_MESSAGE + winner.joinToString(", "))
    }

    companion object {
        const val ERROR_MESSAGE = "[ERROR] "
        const val RESULT_MESSAGE = "실행 결과"
        const val RESULT_WINNER_MESSAGE = "최종 우승자 : "
        const val DUPLICATE_NAME_MESSAGE = "자동차 이름은 중복될 수 없습니다."
        const val WRONG_SIZE_NAME_MESSAGE = "자동차 이름은 5글자 이하여야 합니다."
        const val REQUEST_RETRY_MESSAGE = " 다시 입력해주세요."
        const val REQUEST_GAME_COUNT_MESSAGE = "시도할 회수는 몇회인가요?"
        const val WRONG_NUMBER_RANGE_MESSAGE = "게임 횟수는 1 이상부터 입력 가능합니다."
        const val WRONG_NUMBER_FORMAT_MESSAGE = "게임 횟수는 숫자만 입력 가능합니다."
    }

}