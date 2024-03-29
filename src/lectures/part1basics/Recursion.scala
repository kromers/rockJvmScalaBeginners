package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def aFactorialFunction(n: Int): Int = {
    if(n <= 0) 1
    else {
      println("Computing factorial of " + n + " I first need factorial of " + (n - 1))
      val result = n * aFactorialFunction(n - 1)
      println("Computing factorial of " + n )

      result
    }


  }

  println("aFactorialFunction: " + aFactorialFunction(10))


  def anotherFactrial(n: Int): BigInt = {
    @tailrec
    def facrHelper(x: Int, accumulator: BigInt): BigInt = {
      if(x <= 1) accumulator
      else facrHelper(x - 1, x * accumulator)
    }

    facrHelper(n, 1)
  }

  println("anotherFactrial: " + anotherFactrial(5000))




  def aConcatTailRecFunc(a: String, n: Int): String = {
    @tailrec
    def concatHelper(nAcc: Int, acc: String): String = {
      if(nAcc <= 1) acc
      else concatHelper(nAcc - 1, a + acc)
    }

    concatHelper(n,"")
  }
  println("aConcatTailRecFunc: " + aConcatTailRecFunc("Javi", 5))



  def isPrimeTailRec(n: Int): Boolean = {
    @tailrec
    def primeTailRecHelper(nHelp: Int, acc: Boolean): Boolean ={
      if(nHelp <= 1) acc
      else ((n % nHelp) != 0) && primeTailRecHelper(nHelp-1,acc)
    }
    primeTailRecHelper(n/2,true)
  }
  println("isPrimeTailRec: " + isPrimeTailRec(2005))



  def aFibonacciTailRec(n: Int): Int ={
    def fibonacciTailRecHelper(i: Int, last: Int,nextLast: Int): Int = {
      if(i == n) last
      else fibonacciTailRecHelper(i + 1, last + nextLast, last)
    }

    if(n <= 2) 1
    fibonacciTailRecHelper(2,1,1)
  }
  println("aFibonacciTailRec: " + aFibonacciTailRec(8))


}
