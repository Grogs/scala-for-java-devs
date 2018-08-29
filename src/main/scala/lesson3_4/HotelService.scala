package lesson3_4

trait HotelService {
  def getHotelNames(hotels: List[Hotel]): List[String]
  def findHotelById(hotels: List[Hotel], id: Int): Option[Hotel]
  def findHotelsByCity(hotels: List[Hotel], city: String): List[Hotel]
  def findCheapestHotel(hotels: List[Hotel]): Hotel
}
