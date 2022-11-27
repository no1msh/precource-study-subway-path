package racingcar.domain

import racingcar.util.isUpperOrLower

class Car(private val name: String) {

    private var position: Int = 0

    init {
        require(name.length in NameLengthRange) { "name's length must be $NameLengthRange" }
        require(name.isUpperOrLower()) { "name must be only upper/lower cases" }
    }

    companion object {
        const val NAME_LENGTH_MIN = 1
        const val NAME_LENGTH_MAX = 5

        val NameLengthRange: IntRange = NAME_LENGTH_MIN..NAME_LENGTH_MAX
    }
}
