package racingcar.domain.racing

import racingcar.util.isUpperOrLower

class Car(private val name: String) : Comparable<Car> {

    private var position: Int = 0

    init {
        require(name.length in AvailableNameLength) { "name's length must be $AvailableNameLength" }
        require(name.isUpperOrLower()) { "name must be only upper/lower cases" }
    }

    fun move() {
        position += 1
    }

    fun getName(): String = name

    override fun compareTo(other: Car): Int = position - other.position

    override fun toString(): String = "$name : ${(0..position).joinToString(separator = "") { "-" }}"

    companion object {
        const val NAME_LENGTH_MIN = 1
        const val NAME_LENGTH_MAX = 5

        val AvailableNameLength: IntRange = NAME_LENGTH_MIN..NAME_LENGTH_MAX
    }
}
