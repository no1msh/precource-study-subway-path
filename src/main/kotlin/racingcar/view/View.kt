package racingcar.view

import racingcar.Car

const val CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"
const val ATTEMPTS_NUMBER_MESSAGE = "시도할 회수는 몇회인가요?"


object View {
    fun viewCarName(): List<String> {
        println(CAR_NAME_MESSAGE)
        InputView.readCarName()
        return repeatIfThrows(
            tryBlock = InputView::readCarName,
            catchBlock = OutputView::printError,
        )
    }

    fun viewAttemptsNumber(): Int {
        println(ATTEMPTS_NUMBER_MESSAGE)
        InputView.readAttemptsNumber()
        return repeatIfThrows(
            tryBlock = InputView::readAttemptsNumber,
            catchBlock = OutputView::printError,
        )
    }

    fun viewResult(cars: List<Car>) {
      println(OutputView.printResult(cars))
    }

    private inline fun <reified T : Throwable, R> repeatIfThrows(
        tryBlock: () -> R,
        catchBlock: (T) -> Unit,
    ): R {
        while (true) {
            try {
                return tryBlock()
            } catch (t: Throwable) {
                if (t !is T) throw t
                catchBlock(t)
            }
        }
    }


}