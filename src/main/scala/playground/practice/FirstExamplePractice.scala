package playground.practice

// 3. Практическая часть
object FirstExamplePractice extends App {
    // hello world по каждой итерации List(1,2,3)
    List(1, 2, 3) foreach {
        _ => println("hello world")
    }
}
