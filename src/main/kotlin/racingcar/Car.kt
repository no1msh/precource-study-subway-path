package racingcar

class Car(private val name: String) {

    private var position: Int = 0

    fun getName():String = name
    fun getProgree():Int = position
    fun doIMoving(){

    }
}
