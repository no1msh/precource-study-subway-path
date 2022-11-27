package racingcar.domain.racing

import racingcar.domain.random.RandomMoveJudgement

class RacingTrack(
    private val cars: List<Car>,
    private val judge: RandomMoveJudgement,
) {

}