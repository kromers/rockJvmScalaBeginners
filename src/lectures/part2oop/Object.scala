package lectures.part2oop

object Object  { //extends App if not a main method

  // SCALA does not have class-level functionality ("static")
  object Person {  // type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String) {
    // instance - level functionality

  }
  // COMPANIONS

  def main(args: Array[String]): Unit = {
    println("Person.N_EYES: " + Person.N_EYES)
    println("Person.canFly: " + Person.canFly)


    // Scala Object = Singleton instance
    val mary = Person
    val john = Person

    println("mary == john: " + (mary == john))


    val mary2 = new Person("Mary")
    val john2 = new Person("John")

    println("mary2 == john2: " + (mary2 == john2))

    val bobbie = Person(mary2,john2)
  }




  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit = {}

}
