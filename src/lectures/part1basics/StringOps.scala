package lectures.part1basics

object StringOps extends App {
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase)
  println(str.length)
  println(str)


  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println('a' + aNumberString + 'z')
  println("a" + aNumberString + 'z')

  println(str.reverse)
  println(str.take(10))



  // Scala-specifific: String interpolators.
  val name = "Javi"
  val age = 38
  val greeting = s"Hello, my name es $name and I am $age years old"
  val anotherGreeting = s"Hello, my name es $name and I am ${age + 1} years old"

  println(greeting)
  println(anotherGreeting)




  // F-interpolators
  val speed = 1000.2f
  val myth = f"$name%s can eat $speed%2.3f burgers per minute"

  println(myth)


  // Raw-interpolater
  println(raw"This is a \n new line")
  val escaped = "This is a \n new line"
  println(raw"$escaped")


}
