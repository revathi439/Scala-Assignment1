package Assignment1

object AddingIfQ4 extends App{
  def addIf(str: String): String =
  {
    if(str.startsWith("if")) str
    else "if "+ str
  }
  println("output is:" + addIf("if good"))
  println("output is: "+ addIf("else bad"))

}
