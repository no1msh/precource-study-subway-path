package racingcar.model

class Car(private val name: String) {

    private var position: Int = 0

    fun move() {
        position += 1
    }

    fun getName(): String {
        return name
    }

    fun getPosition(): Int {
        return position
    }

    fun result(): String {
        var result = "$name : "
        repeat(position){result += "-"}
        return result
    }
}