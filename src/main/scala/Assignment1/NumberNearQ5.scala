package Assignment1

object NumberNearQ5 extends App{

  def find(A: Int, B:Int): Int =
  {
    val A_abs = Math.abs(A-100)
    val B_abs = Math.abs(B-100)
    if(A_abs == B_abs) 0
    else if(A_abs<B_abs) A
    else B
  }
  println("result is: "+ find(66, 88))
  println("result is :"+ find(78, 79))
  println("result is:"+ find(89,89))

}
