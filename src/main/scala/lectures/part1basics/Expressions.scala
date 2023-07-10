package lectures.part1basics

object Expressions extends App {
  // Instructions (DO) vs Expressions (VALUE)
  // Instructions are executed (like java)
  // Expressions are evaluated (like Scala)

  // IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3
  println(if (aCondition) 5 else 3)
  println(1 + 3)

  // Looping is for imperative language (Java)
  // NEVER WRITE THIS AGAIN
  var i = 0
  while (i < 10) {
    println(i)
    i+= 1
  }

  // everything in Scala is an Expression
  // side effects: println(), while, reassigning
  var aVariable = 0
  val aWeirdValue = (aVariable = 3) // Unit == void
  println(aWeirdValue)


  // code blocks in scala are expressions
  // The value of the block is the value of its last expression
  val aCodeBlock = { // This block type is string
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // 1. Difference between "hello world" and println("hello world")?
  // 2. Guess the value of the following

  val someValue = { // true (boolean)
    2 < 3
  }

  println(someValue)

  val someOtherValue = { // 42
    if (someValue) 239 else 986
    42
  }

  println(someOtherValue)





}
