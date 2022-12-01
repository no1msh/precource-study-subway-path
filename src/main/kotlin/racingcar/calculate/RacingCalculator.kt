package racingcar.calculate

import racingcar.Car
import racingcar.RacingParameter
import camp.nextstep.edu.missionutils.Randoms.pickNumberInRange
import racingcar.RacingMessage

object RacingCalculator {

    fun splitCarList(cars: String): List<String> = cars.split(RacingMessage.SPLIT_NO_SPACE.toString())
    fun makeInitProgressList(cars: List<String>): MutableList<Car> {
        val carProgress = mutableListOf<Car>()
        for (count: Int in RacingParameter.START_COUNT.number until cars.size)
            carProgress.add(Car(cars[count]))
        return carProgress
    }

    fun progressRandom(cars: MutableList<Car>) : List<Int> {
        val moving = mutableListOf<Int>()
        for(count: Int in RacingParameter.START_COUNT.number until cars.size){
            moving.add(pickNumberInRange(1,9))
        }
        return moving.toList()
        //Randoms.pickUniqueNumbersInRange(RacingParameter.RANDOM_NUMBER_MINIMUM.number,RacingParameter.RANDOM_NUMBER_MAXIMUM.number,cars.size)
    }

    fun carProgress(position: Int): String {
        var progress = RacingMessage.RACING_PROGRESS_STANDARD.toString()
        for (count: Int in RacingParameter.START_COUNT.number until position) {
            progress += RacingMessage.RACING_PROGRESS
        }
        return progress
    }

    fun getWinner(cars: MutableList<Car>): MutableList<Car> {
        val winners = mutableListOf<Car>()
        winners.add(cars[RacingParameter.START_COUNT.number])
        for (count: Int in RacingParameter.GET_RACE_WINNER_START.number until cars.size) {
            if (winners[RacingParameter.START_COUNT.number].getProgress() < cars[count].getProgress()) {
                winners.clear()
                winners.add(cars[count])
                continue
            }
            if (winners[RacingParameter.START_COUNT.number].getProgress() == cars[count].getProgress())
                winners.add(cars[count])
        }
        return winners
    }

}