package Chapter2

object Chapter2Exercises extends App {

  // 2.4.0.1

  val fortyTwo = 50 - 2 - 6 - 30 + 30

  // 2.4.0.2

  val string1 = "The fox jumped "
  val string2 = "over the fence."

  val string3 = string1.++(string2)
  val string3Equiv = string1 ++ string2

  // 2.4.0.3
  
  // The same precedence rules hold in scala for numbers.
  // The below evaluates to what it does in math.

  val precedence = 1 + 2 * 3 // 7
  val precedence2 = 1 + 3 * (4 - 7) + 9 / 1 // 1

  // 2.4.0.4

  val three = 1 + 2 // will compile, has a type of Int

  val threeAgain = "3".toInt // will compile, has a type of Int

  val electricBlue = "Electric blue".toInt // will compile, has type Int. Will present a run-time error

  val letterE = "Electric blue".take(1) // will compile, has a type of String

  val blue = "Electric blue".take("blue") // will not compile

  val aNumber = 1 + ("Moonage daydream".indexOf("N")) // will compile, has a type of Int

  val anotherNum = 1 / 1 + ("Moonage daydream".indexOf("N")) // will compile, has a type of Int

  val andAnotherNum = 1 / (1 + ("Moonage daydream".indexOf("N"))) // will compile, has a type of Int. Will have a run-time error

  // 2.4.0.5

  """
  Doubles are just an approximation to Real numbers because for some numbers like pi and 1/3,
  their representation is infinite and hence too large to hold in a computer's memory. A
  Double only takes up 64 bits."""

  // 2.4.0.6

  """
  We could in fact write a stock market or computer game with just this model, but there are other
  abstractions that can help us write programs. A function is one such abstraction. We can place
  our expressions in functions, and have that function return a value. This would allow us to
  compose our program of functions."""
}
