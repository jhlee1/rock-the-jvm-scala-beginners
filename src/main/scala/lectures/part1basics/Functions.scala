package lectures.part1basics

object Functions extends App{

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  // When you need loops, use recursions.
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // Sideeffect in here means something other than computing itself (printing on the console ...)
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  // 1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
  // 2. Factorial function 1 * 2 * 3 * .. * n
  // 3. Fib function
  // 4. Test if a number is prime

  def greetingFunction(name: String, age: Int): String = {
    s"Hi, my name is $name and I am $age years old."
  }

  def factorialFunction(n: Int): Int = {
    if (n <= 1) {
      1
    } else {
      n * (factorialFunction(n - 1))
    }
  }

  def fibFunction(n: Int): Int = {
    if (n < 1) {
      0
    } else if (n <= 2) {
      1
    } else {
      fibFunction(n - 1) + fibFunction(n - 2)
    }
  }

  def primeFunction(n: Int): Boolean = {
    def isPrimeUntil(divider: Int): Boolean = {
      if (divider <= 1) {
        true
      } else if (n % divider == 0) {
        false
      } else {
        isPrimeUntil(divider - 1)
      }
    }

    if (n == 2) {
      true
    } else {
      isPrimeUntil(n - 1)
    }
  }

  println(s"7 is prime: " + primeFunction(7))
  println(s"37 is prime: " + primeFunction(37))
  println(s"2003 is prime: " + primeFunction(2003))
  println(s"37 * 17 is prime: " + primeFunction(37 * 17))







}
