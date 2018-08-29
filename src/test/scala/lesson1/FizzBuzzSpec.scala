package lesson1

import org.scalatest.{FunSuite, Matchers}

object FizzBuzz {
  def getResult(i: Int): String = throw new NotImplementedError
}

class FizzBuzzSpec extends FunSuite with Matchers {

  test("return fizz if the number is dividable by 3") {
    FizzBuzz.getResult(3) should be ("fizz")
    FizzBuzz.getResult(6) should be ("fizz")
  }

  test("return buzz if the number is dividable by 5") {
    FizzBuzz.getResult(5) should be ("buzz")
    FizzBuzz.getResult(10) should be ("buzz")
  }

  test("return fizzbuzz if the number is dividable by 15") {
    FizzBuzz.getResult(15) should be ("fizzbuzz")
    FizzBuzz.getResult(30) should be ("fizzbuzz")
  }

  test("return the same number if no other requirement is fulfilled") {
    FizzBuzz.getResult(1) should be ("1")
    FizzBuzz.getResult(2) should be ("2")
    FizzBuzz.getResult(4) should be ("4")
  }
}