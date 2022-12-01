package racingcar

import racingcar.domain.RacingManager

fun main() {
    try {
        RacingManager.gameStart()
    } catch(error :Exception){
        println(error.message)
    }
}
