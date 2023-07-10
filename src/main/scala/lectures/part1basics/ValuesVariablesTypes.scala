package lectures.part1basics

object ValuesVariablesTypes extends App {

  //  VAL is IMMUTABLE
  val x: Int = 42

  //  Compiler can infer types
  val y = 42

  // var is mutable
  var z: Int = 55

  z = 11

  println(x)

  //  It is not preferred way to use `var` in scala.
  //  Use `val` in most cases

}
