package racingcar

class Referee(private val cars: List<Car>) {
    fun getWinners(): List<String> {
        var max = 0
        val winners = mutableListOf<String>()
        cars.forEach{
            if(it.getPosition() == max){
                winners.add(it.getCarName())
            }
            if(it.getPosition() > max){
                winners.clear()
                winners.add(it.getCarName())
                max = it.getPosition()
            }
        }
        return winners
    }
}
