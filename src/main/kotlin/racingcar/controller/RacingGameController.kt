package racingcar.controller

import racingcar.model.racing.RacingGame
import racingcar.model.racing.RacingTrack
import racingcar.view.View

class RacingGameController(
    private val view: View
) {

    private lateinit var racingGame: RacingGame
    private var racingCount = 0

    fun execute() {
        initRacingCars()
        initRacingTryCount()
        startRacingGame()
        showGameResult()
    }

    private fun initRacingCars() {
        val carNames = view.requestRacingCarNames()

        racingGame = RacingGame(
            RacingTrack.newInstance(carNames)
        )
    }

    private fun initRacingTryCount() {
        racingCount = view.requestRacingTryCount()
    }

    private fun startRacingGame() {
        racingGame.startRacing(racingCount)
    }

    private fun showGameResult() {
        view.printGameResult(racingGame.getRacingLogs())
        view.printFinalWinners(racingGame.getFinalWinners())
    }
}