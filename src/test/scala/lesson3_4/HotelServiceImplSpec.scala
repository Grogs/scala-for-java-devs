package lesson3_4

import org.scalatest.{FunSuite, Matchers}

class HotelServiceImplSpec extends FunSuite with Matchers {

  private val hotels = List(
    Hotel(1, "Hilton London Canary Wharf", "London", 111),
    Hotel(2, "AC Porte Maillot Hotel", "Paris", 169),
    Hotel(3, "AC Hotel Atocha", "Madrid", 97),
    Hotel(4, "Hotel l'Antoine", "Paris", 119)
  )
  private val hotelsService = new HotelServiceImpl

  test("getHotelNames should return the hotel names list") {
    val hotelNames = hotelsService.getHotelNames(hotels)
    hotelNames shouldBe List("Hilton London Canary Wharf",
                             "AC Porte Maillot Hotel",
                             "AC Hotel Atocha",
                             "Hotel l'Antoine")
  }

  test("getHotelNames should return empty list of names if the hotels list is empty") {
    val hotelNames = hotelsService.getHotelNames(List.empty[Hotel])
    hotelNames shouldBe List.empty[String]
  }

  test("findHotelById should return the found hotel with the indicated id") {
    val hotelsInParis = hotelsService.findHotelById(hotels, 2)
    hotelsInParis shouldBe Some(
      Hotel(2, "AC Porte Maillot Hotel", "Paris", 169))
  }

  test("findHotelById should return None when no hotel found for the indicated id") {
    val hotelsInParis = hotelsService.findHotelById(hotels, 10)
    hotelsInParis shouldBe None
  }

  test("findHotelById shouldreturn None when the hotels list is empty") {
    val hotelsInParis = hotelsService.findHotelById(List.empty[Hotel], 10)
    hotelsInParis shouldBe None
  }

  test("findHotelsByCity should return a list of the hotels located in the indicated city") {
    val hotelsInParis = hotelsService.findHotelsByCity(hotels, "Paris")
    hotelsInParis shouldBe List(
      Hotel(2, "AC Porte Maillot Hotel", "Paris", 169),
      Hotel(4, "Hotel l'Antoine", "Paris", 119)
    )
  }

  test("findHotelsByCity should return empty list if there are no hotels in the indicated city") {
    val hotelsInRome = hotelsService.findHotelsByCity(hotels, "Rome")
    hotelsInRome shouldBe List.empty[Hotel]
  }

  test("findHotelsByCity should return empty list if the passed list is empty") {
    val hotelsInRome =
      hotelsService.findHotelsByCity(List.empty[Hotel], "Paris")
    hotelsInRome shouldBe List.empty[Hotel]
  }

  test("findCheapestHotel should return the hotel with the cheapest price") {
    val cheapestHotel = hotelsService.findCheapestHotel(hotels)
    cheapestHotel shouldBe Hotel(3, "AC Hotel Atocha", "Madrid", 97)
  }
}
