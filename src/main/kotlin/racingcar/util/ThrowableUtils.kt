package racingcar.util

inline fun <reified T : Throwable, R> repeatIfThrows(
    tryBlock: () -> R,
    catchBlock: (T) -> Any,
): R {
    while (true) {
        try {
            return tryBlock()
        } catch (t: Throwable) {
            if (t !is T) throw t
            catchBlock(t)
        }
    }
}