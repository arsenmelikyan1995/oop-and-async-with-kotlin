package enumEx

fun main() {
    val direction: Direction = Direction.WEST

    println(direction.name)
    println(direction.ordinal)

    val parsedDirection = Direction.valueOf("NORTH")
    println(direction.name)
    println(parsedDirection.name)

    val apiValue = Direction.values()[3]
    println(apiValue.name)

    val color = HighlightColor.BLUE
    println(color.value)
}