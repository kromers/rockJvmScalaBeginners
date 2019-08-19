package lectures.part2oop

object Inheritance extends App {

  sealed class Animal {
    val creatureType: String = "wild"
    private def eat = println("pienso")
    // final protected def numPatas = println("4 patas")
    protected def numPatas = println("4 patas") // use final for not allow override
  }

  class Cat extends Animal {
    def crunch = {
      println(cat.numPatas) // method eat is protected
    }

  }

  val cat = new Cat
  //println(cat.eat) // method eat is private
  // println(cat.numPatas) // method eat is protected


  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name,0)
  }
  class Adult(name: String, age: Int, idCard: Int) extends Person(name) // age now is not necesary because age has a defaul value.


  // overriding
  class Dog(override val creatureType: String) extends Animal {
    override def numPatas = {
      super.numPatas
      println("2 patas")
    }
    //override val creatureType: String = "domestic"
  }

  val dog = new Dog("domestic")
  println(dog.numPatas)
  println(dog.creatureType)


  // type substitution ()
  val unknownAnimal: Animal = new Dog("semidomestic")
  println(unknownAnimal.creatureType)

  // overRiding vs overLoading


  // preventing overrides
  // 1 - Use keyword final
  // 2 - Use keyword final on the entire class
  // 3 - Seal the class = extend classes in THIS FILE, prevent extension in other files
}
