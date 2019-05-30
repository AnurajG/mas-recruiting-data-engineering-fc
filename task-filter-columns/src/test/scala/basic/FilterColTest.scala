package basic

import com.bosch.test.FilterCol._
import org.apache.spark.sql.SparkSession
import org.junit.{After, Before, Test}

/**
  * Created by Judy
  */
@Test
class FilterColTest {

  private var spark: SparkSession = null

  /**
    * Create Spark context before tests
    */
  @Before
  def setUp(): Unit = {
    spark = {
      SparkSession.builder().appName("InterviewTest").master("local").getOrCreate()
    }
  }

  /**
    * Stop Spark context after tests
    */
  @After
  def tearDown(): Unit = {
    spark.stop()
    spark = null
  }


  @Test
  def TestValidColumns(): Unit = {

    val examples = Seq(
      phoneNumbers("(123)-456-7890", "123-456-7890", "(123)-456-789", null, "(123)456-7890"),
      phoneNumbers("(123)-456-7890", "123-4567890", "(123)-456-7890", "(123)-456-7890", null),
      phoneNumbers("(123)-456-7890", "1234567890", "(123)-456-7890", "(123)-456-7890", null)
    )
    val dfInput = spark.createDataFrame(examples)
    val dfOutput = dfInput.filterColumns()

    assert(Array("c1", "c2") should contain theSameElementsAs (dfOutput.columns))
    assert(3 == dfOutput.count())
  }

  // feel free to add to/change this
  case class phoneNumbers(c1: String, c2: String, c3: String, c4: String, c5: String)

}
