package domain

import view.View

class CarManager {
    private var cars: MutableList<Car> = mutableListOf()
    private var tryCnt: Int = 0
    private val view = View()

    /**
     * 사용자에게 이름을 입력받고 자동차 생성
     */
    fun makeCars() {
        val carNames = view.requireCarNames()
        for (name in carNames) {
            makeCar(name)
        }
    }

    /**
     * 자동차 생성 및 CarManager 에 추가
     */
    fun makeCar(name: String) {
        cars.add(Car(name))
    }


}