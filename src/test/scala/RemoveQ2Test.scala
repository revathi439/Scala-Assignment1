import Assignment1.RemoveQ2
import org.scalatest.funsuite.AnyFunSuite

class RemoveQ2Test extends AnyFunSuite{

  test("RemoveQ1"){
    assert(RemoveQ2.remove("Scala",1)==="Sala")
    assert(RemoveQ2.remove("Scala",0)==="cala")
    assert(RemoveQ2.remove("Scala",4)==="Scal")
  }

}
