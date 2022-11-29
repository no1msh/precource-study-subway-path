package racingcar

class Car(private val name: String) {

    private var position: Int = 0

    fun move() {
        position += 1
    }

    fun result(): String {
        var result = "$name : "
        repeat(position){result += "-"}
        return result
    }
}
