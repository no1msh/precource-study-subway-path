package racingcar.domain.racing

import racingcar.view.View

class RacingGame(private val view: View) {

    private lateinit var racingTrack: RacingTrack

    fun play() {
        val carNames = view.requestRacingCarNames()
        val tryCount = view.requestRacingTryCount()

        racingTrack = RacingTrack.newInstance(carNames)

        startGame(tryCount)

        view.printFinalWinners(racingTrack.getFinalWinners())
    }

    private fun startGame(tryCount: Int) {
        view.printGameResult()

        repeat(tryCount) {
            racingTrack.moveCars()

            view.printRacingLog(racingTrack.getCurrentRacingLog())
        }
    }

    companion object {
        const val TRY_COUNT_MIN = 1
        const val TRY_COUNT_MAX = 10_000

        val AvailableTryCountRange: IntRange = TRY_COUNT_MIN..TRY_COUNT_MAX
    }
}