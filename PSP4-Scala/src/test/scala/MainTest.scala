import org.scalatest.Matchers._
import org.scalatest.WordSpec
import org.scalatest.mockito.MockitoSugar

/**
  * MainTest
  */
class MainTest extends WordSpec with MockitoSugar {
  private def theParameters = afterWord("the parameters")

  val noArguments = Array.empty[String]
  val expectedArguments = Array("9", "1.1", "0.00001")

  "The main execution" when theParameters {
    "are empty" should {
      "throw an IllegalArgumentException" in {
        intercept[IllegalArgumentException](Main.checkIfIsValid(noArguments))
      }
    }
    "have an existing filename as first argument" should {
      "continue without problems" in {
        Main.checkIfIsValid(expectedArguments)
      }
    }
  }
}
