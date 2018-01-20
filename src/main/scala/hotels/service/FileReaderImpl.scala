package hotels.service

import java.util

import scala.collection.JavaConverters._
import scala.io.Source
import scala.util.Try

class FileReaderImpl extends FileReader {
  override def readFile(sourcePath: String): util.List[String] = {
    readFileInScala(sourcePath).asJava
  }

  private def readFileInScala(sourcePath: String): List[String] = {
    Try(Source.fromResource(sourcePath).getLines().toList)
      .getOrElse(Nil)
  }
}
