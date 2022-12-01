package racingcar.exceptions

object ValidationUserInput {

    private const val PREFIX = "[ERROR] "

    fun validateCarNames(cars: String) {
        val carNames = cars.split(",")
        for (carName in carNames) {
            require(carName.length <= 5) { PREFIX + "5글자 이하의 이름으로 입력해주세요." }
        }
    }

    fun validateCount(count : String) {
        require(count.matches("^\\d*\$".toRegex())){ PREFIX + "숫자로 입력해주세요."}
    }


}