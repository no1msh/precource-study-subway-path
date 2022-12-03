package service

import domain.CarManager
import view.OutputView

class Controller {
    private val carManager = CarManager()

    fun play() {
        carManager.getNamesAndMakeCars()
        carManager.getTryCnt()
        do {
            carManager.nextStep()
        } while (carManager.confirmWinners().isEmpty())
        val winner = carManager.confirmWinners()
        OutputView().printResult(winner)
    }
}