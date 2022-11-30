package racingcar

const val NAME_RANGE = 5
const val NOT_INCLUSIVE_NAME_RANGE = "자동차 이름은 5글자 이하 여야 합니다."
const val NOT_NUMBER = "숫자여야 합니다."

object ExceptionHandler {
    fun checkCarName(carNames: List<String>) {
        carNames.forEach {
            require(it.length <= NAME_RANGE) { NOT_INCLUSIVE_NAME_RANGE }
        }
    }

    fun String.toIntOrThrow(): Int = requireNotNull(toIntOrNull()) { NOT_NUMBER }
}