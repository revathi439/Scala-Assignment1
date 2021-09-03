import Assignment1.NumberNearQ5
import org.scalatest.funsuite.AnyFunSuite

class NumberNearQ5 extends AnyFunSuite{

  test("Numbernear to 100")
  {
    assert(NumberNearQ5.find(66,88)===88)
    assert(NumberNearQ5.find(34,98)===98)
    assert(NumberNearQ5.find(89,90)===90)
  }

}
