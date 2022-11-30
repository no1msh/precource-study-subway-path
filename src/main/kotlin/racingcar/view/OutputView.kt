package racingcar.view

const val ERROR = "[ERROR]"

object OutputView {
    fun printError(e: IllegalArgumentException) {
        println("$ERROR ${e.message}")
    }

}
