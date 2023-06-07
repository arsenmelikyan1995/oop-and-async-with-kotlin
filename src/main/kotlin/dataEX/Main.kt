package dataEX

fun main() {
    val task1 = Task("t1", "Add analytics")
    val task2 = Task("t1", "Add analytics")

    println(task1.name)
    println(task2.name)

//    val task2Copy = task2.copy()
    val task2Copy = task2.copy(id = "t3")

    val (id, name) = task1
    println(id)
    println(name)
    println("`````````````````````````````")

    if (task2Copy == task2) {
        println("Tasks are the same")
    } else {
        println("Tasks are different")
    }

}