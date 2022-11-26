package playground
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import playground.example.FirstExample

class FirstExampleTest extends AnyFlatSpec with Matchers {

    "FirstExample getHelloWorld" should "return correct string" in {
        FirstExample.getHelloWorld shouldEqual "hello world"
    }
}
