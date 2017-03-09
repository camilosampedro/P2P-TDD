import org.scalatest.Matchers._
import org.scalatest.WordSpec
import org.scalatest.mockito.MockitoSugar

/**
  * MainTest
  */
class MainTest extends WordSpec with MockitoSugar {
  private def theParameters = afterWord("the parameters")

  val noArguments = Array.empty[String]
  val expectedArguments = Array(getClass.getResource("test.txt").getFile)

  trait MockOutput extends Output {
    var messages: Seq[String] = Seq.empty[String]

    override def println(s: String): Unit = messages = messages :+ s
  }

  "The main execution" when theParameters {
    "are empty" should {
      "throw an IllegalArgumentException" in {
        intercept[IllegalArgumentException](Main.main(noArguments))
      }
    }
    "have an existing filename as first argument" should {
      "continue without problems" in {
        Main.main(expectedArguments)
      }
    }
  }
}
