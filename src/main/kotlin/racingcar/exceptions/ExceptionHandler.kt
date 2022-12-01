package racingcar.exceptions

const val NAME_RANGE = 5

object ExceptionHandler {
    fun checkCarName(carNames: List<String>) {
        carNames.forEach {
            require(it.length <= NAME_RANGE) { "자동차 이름은 5글자 이하 여야 합니다." }
        }
    }

    fun String.toIntOrThrow(): Int = requireNotNull(toIntOrNull()) { "숫자여야 합니다." }
}