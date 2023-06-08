package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//fun main(){
//    GlobalScope.launch { println("Hello Coroutines") }
////    Thread.sleep(1000)
//}

fun main(): Unit = runBlocking {
    launch { println("Hello Coroutines") }
}