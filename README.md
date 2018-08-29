# Scala for Java developers

The plan of this course is getting started with Scala for developers who mainly work with Java. 

Before starting to check the code, it is recommendable to read some useful commands of [SBT.](https://github.com/soniarodriguez/scala-for-java-devs/tree/lesson1-java/sbt-getting-started.md)

## Lesson 1

There are two code katas in `src/test/scala/lesson1` for you to complete using TDD.

1. Fizz Buzz (Easy)
    - https://www.wikiwand.com/en/Fizz_buzz
    - Uncomment the test cases in `FizzBuzzSpec`, create an object called `FizzBuzz` with a method `getResult`, and implement it, using the tests ot guide you.
    
    
2. Berlin Clock (Medium) 
    - https://www.wikiwand.com/en/Mengenlehreuhr
    - Uncomment the test cases in `BerlinClockSpec`, create an object called `BerlinClock` and implement it, using the tests ot guide you.
    
    
## Lesson 2
Fix `lesson2.NamesServiceSpec` by implementing `lesson2.NamesServiceImpl`.

## Lesson 3 & 4
Let's practise what we have learnt so far using traits and case classes. 
 1. Implements the method `getHotelNames` in `HotelServiceImpl`, which receives a list of hotels and it will return the
 list of each hotel name preserving the order.
 
 ```
  def getHotelNames(hotels: List[Hotel]): List[String] = ???
 ```
 
 
2. Implements the method `findHotelById` in `HotelServiceImpl`, which receives a list of hotels and an id and it will
  return the hotel found for that id in a safe way (using `Option`).
  
 ```
  def findHotelById(hotels: List[Hotel], id: Int): Option[Hotel] = ???
 ```
 
  
3. Implements the method `findHotelsByCity` in `HotelServiceImpl`, which receives a list of hotels and a city name and
 it will return the list of hotels found in that city.
 
 ```
 def findHotelsByCity(hotels: List[Hotel], city: String): List[Hotel] = ???
 ```
  
  
4. Implements the method `findCheapestHotel` in `HotelServiceImpl`, which receives a list of hotels and
 it will return the hotel whose price is the cheapest one. Assume no empty list will be received.
 
 ```
 def findCheapestHotel(hotels: List[Hotel]): Hotel = ???
 ```
 
 
 * **Remember**: Try to use `map`, `filter`, `find`, `fold`, `foldLeft`, `foldRight`, `reduceLeft `& `reduceRight`, `Option`
 or for-comprenhension.



    
    
    
## Spare exercise
Conway's Game of Life
    - https://www.wikiwand.com/en/Conway%27s_Game_of_Life 
    - No test cases given. You get to figure out how to test it!
    - I recommend you pair with another student for this Kata. 
        - If you pair, I would recommend "ping pong pairing": http://wiki.c2.com/?PairProgrammingPingPongPattern

