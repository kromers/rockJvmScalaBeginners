package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2
  println("x: " + x)

  println(8 / (4 * 2))

  println( !(1 != x))


  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println("aConditionedValue: " + aConditionedValue)
  println(if(aCondition) 5 else 3)

  var aVariable = 5


  val aWeirdValue = (aVariable = 3)

  println("aWeirdValue: " + aWeirdValue)

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "hello" else "goodbye"
  }

}
