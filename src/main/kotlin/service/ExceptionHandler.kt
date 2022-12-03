package service

object ExceptionHandler {
    /**
     * 자동차 이름 입력 시 알파벳과 쉼표만 입력했는지 확인
     */
    fun checkNames(names: String) {
        try {
            for (i in names) {
                require(i in 'A'..'Z' || i in 'a'..'z' || i == ',') {
                    Message.ERROR.toString()
                }
            }
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }
}