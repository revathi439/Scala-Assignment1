import Assignment1.RangeQ6
import org.scalatest.funsuite.AnyFunSuite

class RangeQ6Test extends AnyFunSuite{
  test("RangeQ6"){
    assert(RangeQ6.find(20,85)===1)
    assert(RangeQ6.find(24,49)===0)
  }

}
