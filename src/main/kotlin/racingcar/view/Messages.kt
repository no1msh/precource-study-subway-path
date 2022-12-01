package racingcar.view

enum class Messages(val value: String) {
    START_GAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    RESULT("최종 우승자 : "),
    ERROR("[ERROR] "),
    RESULT_WINNER("최종 우승자 : "),
    DUPLICATE_NAME("자동차 이름은 중복될 수 없습니다."),
    WRONG_SIZE_NAME("자동차 이름은 5글자 이하여야 합니다."),
    REQUEST_RETRY(" 다시 입력해주세요."),
    REQUEST_GAME_COUNT("시도할 회수는 몇회인가요?"),
    WRONG_NUMBER_RANGE("게임 횟수는 1 이상부터 입력 가능합니다."),
    WRONG_NUMBER_FORMAT("게임 횟수는 숫자만 입력 가능합니다.")
}