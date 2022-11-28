package racingcar

import camp.nextstep.edu.missionutils.Randoms

class Car(private val name: String) {

    private var position: Int = 0

    // 추가 기능 구현부
    fun getName(): String = name

    fun getPosition(): Int = position

    fun drive() {
        val randomNumber = pickNumber()[0]
        if (randomNumber >= CONDITION) {
            position += 1
        }
    }

    fun printPosition() = println("position: $position")

    fun printResult() {
        var distance = ""
        for (i in 0 until position) {
            distance += "-"
        }
        println("$name : $distance")
    }

    fun pickNumber(): List<Int> {
        return Randoms.pickUniqueNumbersInRange(START_NUMBER, END_NUMBER, COUNT)
    }

    companion object {
        private const val START_NUMBER = 0
        private const val END_NUMBER = 9
        private const val COUNT = 1
        private const val CONDITION = 4
    }
}
