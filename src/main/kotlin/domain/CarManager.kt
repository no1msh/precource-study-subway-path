package domain

import view.View

class CarManager {
    private var cars: MutableList<Car> = mutableListOf()
    private var tryCnt: Int = 0
    private val view = View()

    /**
     * 사용자에게 이름을 입력받고 자동차 생성
     */
    fun getNamesAndMakeCars() {
        val carNames = view.requireCarNames()
        for (name in carNames) {
            makeCar(name)
        }
    }

    /**
     * 시도 횟수 입력
     */
    fun getTryCnt() {
        tryCnt = view.requireTryCnt()
    }

    /**
     * 자동차 생성 및 CarManager 에 추가
     */
    fun makeCar(name: String) {
        cars.add(Car(name))
    }

    /**
     * 우승자 확인
     */
    fun confirmWinners(): MutableList<String> {
        var firstPlayers = mutableListOf<String>()
        for (car in cars) {
            if (car.getCurrentPosition() == tryCnt) {
                firstPlayers.add(car.getName())
            }
        }
        return firstPlayers
    }

    /**
     * 자동차별로 무작위 숫자를 뽑고 조건 이상인 경우 전진
     */
    fun nextStep() {
        for (car in cars) {
            car.move()
        }
        view.printStep(cars)
    }
}