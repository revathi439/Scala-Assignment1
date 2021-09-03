package Assignment1

object FourCopiesQ1 extends App{

  def copy(str:String): String =
  {
    if(str.length<2)str
    else str.substring(0,2)*4
  }
  println("output is: " +copy("India"))


}
