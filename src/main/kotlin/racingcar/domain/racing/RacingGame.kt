package racingcar.domain.racing

import racingcar.domain.random.RandomMoveJudgement

class RacingGame {

    companion object {
        const val TRY_COUNT_MIN = 1
        const val TRY_COUNT_MAX = 10_000

        val AvailableTryCountRange: IntRange = TRY_COUNT_MIN..TRY_COUNT_MAX
    }
}