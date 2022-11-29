package racingcar

enum class RacingParameter(val number: Int) {
    START_COUNT(0),
    CAR_NAME_LENGTH_MINIMUM(1),
    CAR_NAME_LENGTH_MAXIMUM(5),
    CAR_MOVING_MINIMUM_NUMBER(4),
    RANDOM_NUMBER_MINIMUM(1),
    RANDOM_NUMBER_MAXIMUM(9),
    GET_RACE_WINNER_START(1)
    ;


}

enum class RacingMessage(private val message: String) {
    EMPTY(""),
    GIVE_ME_CAR_LIST("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    HOW_MANY_COUNT("시도할 회수는 몇회인가요?"),
    RACING_PROGRESS_STANDARD(" : "),
    RACING_PROGRESS("-"),
    RESULT_ON_THE_WAY("실행 결과"),
    RESULT_WINNER("최종 우승자 : "),
    SPLIT(", "),
    ERROR_NAME_LENGTH("[ERROR] 차의 이름은 1~5자 사이여야합니다. 다시 입력하세요."),
    ERROR_COUNT_IS_NOT_NUMBER("[ERROR] 시도 횟수는 숫자여야 합니다. 다시 입력하세요.")


    ;

    override fun toString(): String = message
}