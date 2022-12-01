package racingcar.controller

import camp.nextstep.edu.missionutils.Randoms.pickNumberInRange
import racingcar.model.Car
import racingcar.view.InputView
import racingcar.view.OutputView

class RacingGame {
    private val inputView = InputView()
    private val outputView = OutputView()

    fun start() {
        val cars = getCarNames()
        val gameCount = getGameCount()
        playGame(cars, gameCount)
        val winner = getWinner(cars)
        outputView.printWinner(winner)
    }

    private fun getWinner(cars: List<Car>): List<String> {
        val score = mutableListOf<Int>()
        val winner = mutableListOf<String>()
        for (car in cars) {
            score.add(car.getPosition())
        }
        val maxScore = score.maxOf { it }
        for (car in cars) {
            if (car.getPosition() == maxScore) {
                winner.add(car.getName())
            }
        }
        return winner
    }

    private fun playGame(cars: List<Car>, gameCount: Int) {
        outputView.printResultMessage()
        for (i in 0 until gameCount) {
            moveCars(cars)
            outputView.printResultCars(cars)
            Thread.sleep(800)
        }
    }

    private fun moveCars(cars: List<Car>) {
        val n = cars.size
        for (i in 0 until n) {
            val random = pickNumberInRange(RANGE_START, RANGE_END)
            if (random >= MOVE_STATE) {
                cars[i].move()
            }
        }
    }

    private fun getCarNames(): List<Car> {
        outputView.printRequestCarNames()
        val names = inputView.getCarNames()
        return toCar(names)
    }

    private fun toCar(names: List<String>): List<Car> {
        val cars = mutableListOf<Car>()
        for (name in names) {
            cars.add(Car(name))
        }
        return cars
    }

    private fun getGameCount(): Int {
        outputView.printRequestGameCount()
        return inputView.getGameCount()
    }

    companion object {
        const val MOVE_STATE = 4
        const val RANGE_START = 0
        const val RANGE_END = 9
    }

}