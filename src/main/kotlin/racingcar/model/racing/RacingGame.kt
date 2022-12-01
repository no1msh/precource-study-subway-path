package racingcar.model.racing

class RacingGame(
    private val racingTrack: RacingTrack
) {

    fun startRacing(count: Int) {
        repeat(count) {
            racingTrack.moveCars()
        }
    }

    fun getRacingLogs(): List<RacingLog> {
        return racingTrack.logs
    }

    fun getFinalWinners(): List<String> {
        return racingTrack.getFinalWinners()
    }

    companion object {
        const val TRY_COUNT_MIN = 1
        const val TRY_COUNT_MAX = 10_000

        val AvailableTryCountRange: IntRange = TRY_COUNT_MIN..TRY_COUNT_MAX
    }
}