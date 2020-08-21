package basic

import org.scalatest.FlatSpec
import org.scalatest._
import com.bosch.test.FilterCol._


class FilterColScalaTest extends FlatSpec with Matchers with SparkSessionTestWrapper {

  case class phoneNumbers(c1: String, c2: String, c3: String, c4: String, c5: String)

  "FilterCol" should "filter out invalid columns" in {

    val example = Seq(
      phoneNumbers("(123)-456-7890", "123-456-7890", "(123)-456-789", null, "(123)456-7890"),
      phoneNumbers("(123)-456-7890", "123-4567890", "(123)-456-7890", "(123)-456-7890", null),
      phoneNumbers("(123)-456-7890", "1234567890", "(123)-456-7890", "(123)-456-7890", null)
    )

    val dfInput = spark.createDataFrame(example)
    val actualDF = dfInput.filterColumns()

    actualDF.columns should contain theSameElementsAs(Array("c1", "c2"))
    actualDF.count() should equal(3L)
  }

}