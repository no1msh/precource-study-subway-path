package racingcar.view

import racingcar.model.Car

object OutputView {

    fun getTempResult(carList: List<Car>): StringBuilder {
        val tempResult = StringBuilder()
        for (car in carList) {
            tempResult.append(car.getName())
                .append(" : ")
                .append(getDashes(car))
                .append("\n")
        }
        tempResult.append("\n")
        return tempResult
    }

    private fun getDashes(car: Car): String {
        val dashes = StringBuilder()
        for (position in 1..car.getPosition()) {
            dashes.append("-")
        }
        return dashes.toString()
    }

    fun getWinner(winners: List<String>): String {
        return winners.joinToString(separator = ", ")
    }

}