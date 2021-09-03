package Assignment1

object RangeQ6 extends App{

  def find(x:Int, y:Int): Int = {
    if ((x <= 20 || y >= 50) || (y <= 20 || x >= 50)) 1
    else 0
  }
  println("result is: " + find(20, 84))
  println("result is: " + find(24 , 48))

}
