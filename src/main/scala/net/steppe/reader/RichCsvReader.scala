package net.steppe.reader

import java.io.File

class RichCsvReader[T](override val file: File) extends CSVReader[T] {

  {
    require(file != null)
    require(file.exists())
  }

  override def iterator: Iterator[T] = {
    parse()
  }
}
