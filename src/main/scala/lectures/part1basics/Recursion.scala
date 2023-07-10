package lectures.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {

  // Why does it crash when n becomes too large? and why does it work when I remove the println => Increase n, it still crashees
//  @tailrec - It complains if it is not a tail recursion
  def factorial(n: Int): BigInt =
    if (n <= 1) 1
    else {
//      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
       n * factorial(n - 1)
//      println("Computed factorial of " + n)

//      result
    }

  println(factorial(10))
//  println(factorial(50000))

  // When you need loop, use _TAIL_RECURSION
  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else {
        factHelper(x - 1, x * accumulator)
      } //Tail recursion = use recursive call as the last expression. As we don't need the intermediate value, the stack memory is replaced so that the stack size does not increase on every recursion

    }

    factHelper(n, 1)
    /*  anotherFactorial(10) = factHelper(10, 1)
    = factHelper(9, 10 * 1)
    = factHelper(8, 9 * 10 * 1)
    = factHelper(7, 8 * 9 * 10 * 1)
    ...
    = factHelper(1, 2 * 3 * ... * 9 * 10 * 1)
    */
  }

  println(anotherFactorial(5000))


  /*
  1. Concatenate a string n times
  2. IsPrime function tail recursive
  3. fibonacci function tail recursive
  */

  @tailrec
  def concatenateString(s: String, n: Int): String = {
    if (n == 0) {
      s
    } else {
      concatenateString(s + s, n - 1)
    }
  }

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(d: Int): Boolean = {
      if (d <= 1) {
        true
      }
      else if (n % d == 0) {
        false
      } else
        isPrimeUntil(d - 1)
    }

    if (n <= 2) {
      true
    } else {
      isPrimeUntil(n - 1)
    }
  }

  // The number of accumulator is the number of calling the function recursively
  // We are calling fib(n-1) + fib(n-2) => Requires 2 accumulator
  def fibFunction(n: Int): Int = {
    @tailrec
    def fibHelper(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fibHelper(i + 1, last + nextToLast, last)

    if (n <= 2) {
      1
    } else {
      fibHelper(2, 1, 1)
    }
  }

  println(fibFunction(8))






}