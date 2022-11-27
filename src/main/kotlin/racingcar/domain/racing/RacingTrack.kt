package racingcar.domain.racing

import racingcar.domain.random.RandomMoveJudgement

class RacingTrack(
    private val cars: List<Car>,
    private val judge: RandomMoveJudgement,
) {

    fun moveCars() {
        for (car in cars) {
            if (judge.isMove()) {
                car.move()
            }
        }
    }

    companion object {
        const val CAR_SIZE_MAX = 20
        const val CAR_SIZE_MIN = 2

        val AvailableCarSize = CAR_SIZE_MIN..CAR_SIZE_MAX
    }
}