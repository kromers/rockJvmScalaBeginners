package lectures.part1basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x) //println("by value: " + 938111847133475L)
    println("by value: " + x) //println("by value: " + 938111847133475L)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + x) //println("by value: " + System.nanoTime())
    println("by name: " + x) //println("by value: " + System.nanoTime())
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())
}
