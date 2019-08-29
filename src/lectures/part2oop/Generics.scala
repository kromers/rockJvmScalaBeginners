package lectures.part2oop


object Generics extends App {

  class MyList[+A] {
    // use the type A
    def add[B >: A](element: B): MyList[B] = ???

    /*
      A = Cat
      B = Animal
     */
  }


  class MyMap[Key, Value]
  val listOfIntegers = new MyList[Int]
  val listOfString = new MyList[String]

  // generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes, List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  //animalList.add(new Dog) //???   HARD QUESTION  => We return a list of Animals

  // 2. NO = INVARIANCE
  class InvariantList[A]
  val invariantList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. HELL, no CONTRAVARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]


  //bounded types
  class Cage[A <: Animal] (animal: A)
  val cage = new Cage(new Dog)

  class Car //extends Animal
  //val newCage = new Cage(new Car) // no se queja el compilador, pero no compila porque Car no es una subclase de Animal

  // expand Mylist to be a generic
}
