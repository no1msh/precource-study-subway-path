package racingcar.view

const val CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"

object View {
    fun viewCarName(): List<String> {
        println(CAR_NAME_MESSAGE)
        InputView.readCarName()
        return repeatIfThrows(
            tryBlock = InputView::readCarName,
            catchBlock = OutputView::printError,
        )
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