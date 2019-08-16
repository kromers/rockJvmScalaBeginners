package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Javi", 37)

  println(person.age)
  println(person.x)

  person.greet("Laura")
  person.greet()
  person.greet2()

  val person2 = new Person()

  println(person2.name)
  println(person2.age)


  val person3 = new Person("Paco")

  println(person3.name)
  println(person3.age)

  val author = new Writer("Charles", "Dickens", 1812)
  val impostor = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(impostor))


  val counter = new Counter
  counter.inc.print
  counter.inc(5).print
  counter.inc.inc.inc.print

}


//Constructor
class Person(val name: String, val age: Int = 0){
  //Body
  val x = 2

  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  //overliading
  def greet(): Unit = println(s"Hi, I am ${this.name}")
  def greet2(): Unit = println(s"Hi, I am $name")


  // multiple constructors
  def this(name: String) = this(name,10)
  def this() = this("Antonio")
}

/*
  Novel and a Writer

  Writer: first name, surname, years
    - method: fullname

  Novel: name, years of release, author
    - authorAge
    - isWrittenBy(author)
    - copy (new year of release) = new instance of Novel
 */

class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + "" + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}
/*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount
 */
class Counter(val count: Int = 0) {
  def inc = {
    println("Incrementing")
    new Counter(count + 1) //inmutability
  }

  def dec = {
    println("Decrementing")
    new Counter(count - 1) //inmutability
  }

  def inc(n: Int): Counter = {
    if(n <= 0) this
    else inc.inc(n - 1)
  }

  //def dec(n: Int) = new Counter(count - n)

  def dec(n: Int): Counter = {
    if(n <= 0) this
    else dec.dec(n - 1)
  }

  def print = println(count)
}

//class parameters are not fields