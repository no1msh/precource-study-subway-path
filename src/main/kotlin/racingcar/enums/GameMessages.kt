package racingcar.enums

enum class GameMessages(private val messages: String) {
    START("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    PLAY_COUNT("시도할 회수는 몇회인가요?"),
    RESULT("실행 결과"),
    WINNER("최종 우승자 :");

    override fun toString(): String = messages
}