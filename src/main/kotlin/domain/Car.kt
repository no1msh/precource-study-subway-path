package domain

import camp.nextstep.edu.missionutils.Randoms

class Car(private val name: String) {

    private var position: Int = 0

    /**
     * 조건 이상일 경우 이동하는 기능
     */
    fun move() {
        val canMove = Randoms.pickNumberInRange(0, 9)
        if (canMove >= Condition.STANDARD.value) {
            position++
        }
    }

    enum class Condition(val value: Int) {
        STANDARD(4)
    }
}
