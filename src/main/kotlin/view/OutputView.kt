package view

import service.Message

class OutputView {
    private fun requireCarNames(){
        println(Message.REQUIRE_CAR_NAME)
    }

    private fun requireTry(){
        println(Message.REQUIRE_TRY)
    }
}