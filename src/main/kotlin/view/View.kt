package view

import domain.Car

class View {
    private val outputView = OutputView()
    private val inputView = InputView()

    fun requireCarNames(): List<String> {
        outputView.printRequireCarNames()
        return inputView.requireCarNames()
    }

    fun requireTryCnt(): Int {
        outputView.printRequireTry()
        return inputView.requireTryCnt()
    }

    fun printResult(cars: List<Car>) {
        for(car in cars){
            outputView.printResult(car)
        }
        println()
    }
}