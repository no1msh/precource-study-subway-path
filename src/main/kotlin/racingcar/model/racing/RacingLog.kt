package racingcar.model.racing

class RacingLog(val carName: String) {

    private val _record: MutableList<Int> = mutableListOf()
    val record: List<Int>
        get() = _record

    fun add(position: Int) {
        _record.add(position)
    }
}