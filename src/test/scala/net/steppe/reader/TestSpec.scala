package net.steppe.reader

import java.io.File

import org.scalatest.FlatSpec

class ReaderSpec extends FlatSpec{

  case class CustomClass(words: String, num1: String,num2: String,num3: String, date: String)

  "CSV Reader" should "return non-empty-iterator" in {
    val csv = new File(getClass.getResource("/csv.csv").getPath)
    val reader = new RichCsvReader(csv)
    assert(reader !=  Iterator.empty)
  }

  "CSV Reader size" should "be 3" in {
    val csv = new File(getClass.getResource("/csv.csv").getPath)
    val reader = new RichCsvReader(csv)
    assert(reader.size ==  3)
  }

  "CSV Reader head" should "be equal to (one,2,3,4,Sun 1989.03.08 at 05:15:00 PM PDT)" in {
    val csv = new File(getClass.getResource("/csv.csv").getPath)
    val reader = new RichCsvReader[(String,String,String,String,String)](csv)
    assert(reader.head.toString == "(one,2,3,4,Sun 1989.03.08 at 05:15:00 PM PDT)")
  }
}
