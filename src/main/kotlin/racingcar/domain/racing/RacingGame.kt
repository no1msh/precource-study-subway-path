package racingcar.domain.racing

import racingcar.view.View

class RacingGame {

    private lateinit var racingTrack: RacingTrack

    fun play() {
        val carNames = View.requestRacingCarNames()
        val tryCount = View.requestRacingTryCount()

        racingTrack = RacingTrack.newInstance(carNames)

        startGame(tryCount)

        View.printFinalWinners(racingTrack.getFinalWinners())
    }

    private fun startGame(tryCount: Int) {
        View.printGameResult()

        repeat(tryCount) {
            racingTrack.moveCars()

            View.printRacingLog(racingTrack.getCurrentRacingLog())
        }
    }

    companion object {
        const val TRY_COUNT_MIN = 1
        const val TRY_COUNT_MAX = 10_000

        val AvailableTryCountRange: IntRange = TRY_COUNT_MIN..TRY_COUNT_MAX
    }
}