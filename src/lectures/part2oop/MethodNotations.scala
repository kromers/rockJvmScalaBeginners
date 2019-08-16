package lectures.part2oop


/**
  * Created by Daniel.
  */
object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0){
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck?!"
    def isAlife: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"

    //Exercides
    def +(nickName: String): Person = new Person(s"$name the $nickName", favoriteMovie)
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def learns(thing: String): String = s"$name is learning $thing"
    def learnsScala = this.learns("Scala")
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
  }


  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //equivalent
  // infix notation = operator notation (syntactic sugar)

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)
  println(mary + tom)
  println(mary.+(tom))

  println(1 + 3)
  println(1.+(3))

  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ?


  // prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  // 1.unary_ prefix only work with - + ~ !

  println(!mary) //equivalent println(mary.unary_!)
  println(mary.unary_!)


  // postfix notation
  println(mary.isAlife)
  println(mary isAlife)

  //apply
  println(mary.apply())
  println(mary())



  // EXERCISES

  /*
    1.  Overload the + operator
        mary + "the rockstar" => new person "Mary (the rocktar)"

    2.  Add an age to the Person class
        Add unary + operator => new person with the age + 1
        +mary => mary with the age incrementer

    3.  Add a "learns" methods in the Person class => "Mary learms Scala"
        Add a learnsScala method, call learns method with "Scala".
        Use it in postfix notation.

    4.  Overload the apply method
        mary.apply(2) => "Mary watched Inception 2 times"

   */

  println((mary + "the rockstar")())
  println((+mary).age)
  println(mary())

  println(mary learnsScala)

  println(mary(10))

}
