package view

import domain.Car
import service.Message

class OutputView {
    fun printRequireCarNames() {
        println(Message.REQUIRE_CAR_NAME.toString())
    }

    fun printRequireTry() {
        println(Message.REQUIRE_TRY.toString())
    }

    fun printResult(car: Car) {
        print(car.getName() + " : ")
        println("-".repeat(car.getCurrentPosition()))
    }
}