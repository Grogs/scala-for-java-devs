package lesson3_4

class HotelServiceImpl extends HotelService {

  override def getHotelNames(hotels: List[Hotel]): List[String] = ???
  override def findHotelById(hotels: List[Hotel], id: Int): Option[Hotel] = ???
  override def findHotelsByCity(hotels: List[Hotel],
                                city: String): List[Hotel] = ???
  override def findCheapestHotel(hotels: List[Hotel]): Hotel = ???
}
