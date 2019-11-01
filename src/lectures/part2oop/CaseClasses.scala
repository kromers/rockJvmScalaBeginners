package lectures.part2oop

object CaseClasses extends App{
  /*
  equals, hasCode, toString
   */

  case class Person(name: String, age: Int)

  // 1. class parameters are fields
  val jim = new Person("Jim",34)
  println("jim.name: " + jim.name)

  // 2. sensible toString
  // println(instance) = println(instance.toString) // syntactic sugar
  println("jim.toString: " + jim.toString)
  println("jim: " + jim)

  // 3. equals and hasCode implemented OOTB
  val jim2 = new Person("Jim",34)
  println("jim == jim2: " + (jim == jim2))

  // 4. CCs have handy copy method
  val jim3 = jim.copy(age = 45)
  println("jim3: " + jim3)

  val jim4 = jim
  println("jim4: " + jim4)

  // 5. CCs have companion objects
  val thePerson = Person
  val mary = Person("Mary", 23)

  // 6. CCs hare serializable
  // Akka

  // 7. CCs have extractor pattern = CCs can be used in PATTERN MATCHING

  case object InitedKingdon{
    def name: String = "The UK og GB and NI"
  }


}
