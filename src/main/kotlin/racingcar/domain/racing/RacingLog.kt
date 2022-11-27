package racingcar.domain.racing

class RacingLog(val logs: List<String>) {

    override fun toString(): String = logs.joinToString("\n")

    companion object {

        fun newInstance(cars: List<Car>): RacingLog {
            val logs = cars.map { it.toString() }
            return RacingLog(logs)
        }
    }
}