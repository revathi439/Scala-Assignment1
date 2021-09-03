import Assignment1.FourCopiesQ1
import org.scalatest.funsuite.AnyFunSuite

class FourCopiesQ1Test extends AnyFunSuite{
  test("FourCopies"){
    assert(FourCopiesQ1.copy("India")==="InInInIn")
  }

}
