package racingcar.model.racing

import racingcar.model.random.RandomMoveJudgement
import racingcar.model.random.RandomNumberGenerator
import racingcar.util.maxAll

class RacingTrack(
    private val cars: List<Car>,
    private val judge: RandomMoveJudgement,
) {

    val logs: List<RacingLog> = cars.map { RacingLog(it.getName()) }

    fun moveCars() {
        for (i in cars.indices) {
            if (judge.isMove()) {
                cars[i].move()
            }

            logs[i].add(cars[i].getPosition())
        }
    }

    fun getFinalWinners(): List<String> {
        return cars.maxAll().map { it.getName() }
    }

    companion object {
        const val CAR_SIZE_MAX = 20
        const val CAR_SIZE_MIN = 2

        val AvailableCarSize = CAR_SIZE_MIN..CAR_SIZE_MAX

        fun newInstance(carNames: List<String>): RacingTrack {
            return RacingTrack(
                cars = carNames.map { Car(it) },
                judge = RandomMoveJudgement(RandomNumberGenerator())
            )
        }
    }
}