package racingcar.errorcheck

object ErrorCheck {
    fun carListCheck(cars : String){
        val carlist = cars.split(",")
        for(count :Int in carlist.indices){
            require(carlist[count].length<=5&&carlist[count].length>=1){/*에러메세지*/}
        }
    }


}