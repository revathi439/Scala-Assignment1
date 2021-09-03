import Assignment1.AddingIfQ4
import org.scalatest.funsuite.AnyFunSuite

class AddingIfQ4Test extends AnyFunSuite{
  test("AddingIfQ4"){
    assert(AddingIfQ4.addIf("if nice")==="if nice")
    assert(AddingIfQ4.addIf("worest")==="if worest")
  }

}
