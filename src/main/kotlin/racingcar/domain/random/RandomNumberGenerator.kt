package racingcar.domain.random

import camp.nextstep.edu.missionutils.Randoms

class RandomNumberGenerator : RandomGenerator {
    override fun generate(startInclusive: Int, endInclusive: Int): Int {
        return Randoms.pickNumberInRange(startInclusive, endInclusive)
    }
}