package racingcar.enums

enum class ErrorMessages(private val messages: String) {
    PREFIX("[ERROR]"),
    LENGTH_EXCEPTION("길이가 맞지 않습니다."),
    DISTINCT_EXCEPTION("중복이 있습니다."),
    DIGIT_EXCEPTION("숫자가 아닙니다.");

    override fun toString(): String = messages
}