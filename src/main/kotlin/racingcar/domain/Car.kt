package racingcar.domain

const val MOVING_MIN_VALUE = 4

class Car(private val name: String) {
    fun getCarName(): String {
        return name
    }

    fun move(attemptsNumber: Int) {
        repeat(attemptsNumber) {
            if (RacingRandomNumberGenerator().generate() >= MOVING_MIN_VALUE) {
                position++
            }
        }
    }

    fun getPosition(): Int {
        return position
    }

    private var position: Int = 0


}
