package racingcar.view

import racingcar.model.Car

class OutputView {
    fun printRequestCarNames() {
        println(Messages.START_GAME.value)
    }

    fun printInputDuplicateError() {
        println(Messages.ERROR.value + Messages.DUPLICATE_NAME.value + Messages.REQUEST_RETRY.value)
    }

    fun printInputLengthError() {
        println(Messages.ERROR.value + Messages.WRONG_SIZE_NAME.value + Messages.REQUEST_RETRY.value)
    }

    fun printRequestGameCount() {
        println(Messages.REQUEST_GAME_COUNT.value)
    }

    fun printInputNumberError() {
        println(Messages.ERROR.value + Messages.WRONG_NUMBER_FORMAT.value)
    }

    fun printInputRangeError() {
        println(Messages.ERROR.value + Messages.WRONG_NUMBER_RANGE.value)
    }

    fun printResultMessage() {
        println(Messages.RESULT.value)
    }

    fun printResultCars(cars: List<Car>) {
        for (car in cars) {
            println(car.result())
        }
        println()
    }

    fun printWinner(winner: List<String>) {
        println(Messages.RESULT_WINNER.value + winner.joinToString(", "))
    }
}