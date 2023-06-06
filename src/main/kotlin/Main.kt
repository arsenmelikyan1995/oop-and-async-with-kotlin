

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    for (i in 10 downTo 0) println(i)
    for (i in 0..9) println(i)
    for (i in 0 until 5) println(i)
    println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
    for (i in 10 downTo 0 step 3) println(i)


    val ints = arrayOf(1, 2, 3, 4, null)
    val nulls = arrayOfNulls<Int>(5)
    val custom = Array(5){index -> index}

    val str = "Hello"
    println()



}