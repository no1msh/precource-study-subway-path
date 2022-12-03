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

    /**
     * 현재 위치 반환
     */
    fun getCurrentPosition(): Int {
        return this.position
    }

    /**
     * 이름 반환
     */
    fun getName(): String {
        return this.name
    }

    enum class Condition(val value: Int) {
        STANDARD(4)
    }
}
