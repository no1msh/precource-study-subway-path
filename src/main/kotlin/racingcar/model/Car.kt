package racingcar.model

import camp.nextstep.edu.missionutils.Randoms

class Car(private val name: String) {

    private var position: Int = 0

    // 추가 기능 구현부
    fun getPosition(): Int = position

    fun getName(): String = name

    fun drive() {
        val randomNumber = pickNumber()
        if (randomNumber >= CONDITION) {
            position += 1
        }
    }

    fun pickNumber(): Int = Randoms.pickNumberInRange(START_NUMBER, END_NUMBER)

    companion object {
        private const val START_NUMBER = 0
        private const val END_NUMBER = 9
        private const val CONDITION = 4

        fun compare(cars: List<Car>): MutableList<String> {
            val sortedCars = sortByPosition(cars)
            val result: MutableList<String> = mutableListOf()
            val winnerCondition = sortedCars[0].second
            sortedCars.forEach {
                if (it.second == winnerCondition) {
                    result.add(it.first)
                }
            }
            return result
        }

        private fun sortByPosition(cars: List<Car>): MutableList<Pair<String, Int>> {
            val sortedCars: MutableList<Pair<String, Int>> = mutableListOf()
            for (car in cars) {
                sortedCars.add(car.name to car.position)
            }
            sortedCars.sortByDescending { it.second }
            return sortedCars
        }
    }
}
