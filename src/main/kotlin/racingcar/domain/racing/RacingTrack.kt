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
}