package racingcar.view.strings

enum class Messages(val message: String) {

    InputCarNames("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    InputTryCount("시도할 회수는 몇회인가요?"),
    GameResult("실행 결과"),
    FinalWinner("최종 우승자 : %s");

    override fun toString(): String = message
}