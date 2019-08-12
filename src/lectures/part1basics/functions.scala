package lectures.part1basics



object functions extends App {

  def aFunction(a: String, b: Int): String = {


    a + " " + b
  }

  println(aFunction("Hello",3))


  def aParameterlessFunction(): Int =  {
    42
  }

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {

    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello",3))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {

    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n -1 )

  }


  def aGreetingFunction(name: String, age: Int): String = {
    s"Hi, my name is $name and I am $age years old"
  }
  println("Exercise 1 (a greeting function): " + aGreetingFunction("Javi", 38))


  def aFactorialFunction(n: Int): BigInt = {
    if(n == 0) 1
    else n * aFactorialFunction(n - 1)
  }
  println("Exercise 2 (a factorial function): " + aFactorialFunction(38))


  def aFibonacciFunction(n: Int): BigInt = {
    if(n == 1) 1
    else if (n == 2) 1
    else aFibonacciFunction(n - 1) + aFibonacciFunction(n - 2)
  }
  println("Exercise 3 (a fibonacci function): " + aFibonacciFunction(38))


  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(number: Int): Boolean = {
      if(number <= 1) true
      else ((n % number) != 0) && isPrimeUntil(number-1)
    }

    isPrimeUntil(n/2)
  }
  println("Exercise 4 (test a prime number): " + isPrime(127))

}
