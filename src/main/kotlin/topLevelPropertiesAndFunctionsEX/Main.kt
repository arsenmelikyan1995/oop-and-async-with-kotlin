package topLevelPropertiesAndFunctionsEX

const val DEFAULT_CLICK_DELAY = 500

private fun log(error: Throwable) = println(error)

fun main() {
    millisForHours(5)
    println(millisForHours(5))
}