package playground.overall

// 5. Итоговый обзор
object FirstExampleOverall extends App {
    // hello world можно записать несколькими способами
    var helloWorldOne = List("hello", "world").mkString(" ")
    var helloWorldTwo = List("world", "hello").reverse.mkString(" ")
    println {helloWorldOne + helloWorldTwo}
}