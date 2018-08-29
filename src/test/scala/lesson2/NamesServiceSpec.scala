package lesson2

import org.scalatest._

class NamesServiceSpec extends FunSuite with Matchers {

  private val guestNames = List("Sonia",
                                "Greg",
                                "Povilas",
                                "Angela",
                                "John",
                                "Adam",
                                "Avinash",
                                "Laura")

  private val namesService = new NamesServiceImpl


  test("return the length of each name") {
    val lengthList = namesService.findLengthOfEachName(guestNames)

    lengthList shouldBe List(5, 4, 7, 6, 4, 4, 7, 5)
  }


  test("return all names which start with letter A") {
    val filteredNames = namesService.findAllNamesWithFirstLetter(guestNames, "A")

    filteredNames shouldBe List("Angela", "Adam", "Avinash")
  }

  test("return empty list if input list is empty") {
    val filteredNames = namesService.findAllNamesWithFirstLetter(List.empty[String], "A")

    filteredNames shouldBe List.empty[String]
  }


  test("return empty list if there are no names starting with particular letter") {
    val filteredNames = namesService.findAllNamesWithFirstLetter(guestNames, "Z")

    filteredNames shouldBe List.empty[String]
  }

  test("return total number of characters in the list") {
    val totalLen = namesService.findTotalLength(guestNames)

    totalLen shouldBe 42
  }

  test("return 0 if the input list is empty") {
    val totalLen = namesService.findTotalLength(List.empty[String])

    totalLen shouldBe 0
  }
}
