import Assignment1.HappyorNotQ7
import org.scalatest.funsuite.AnyFunSuite

class HappyorNotQ7 extends AnyFunSuite{
  test("HappyorNot"){}
  assert(HappyorNotQ7.find("Apple",2)=== "happy")
  assert(HappyorNotQ7.find("Apple",3)==="not happy")

}
