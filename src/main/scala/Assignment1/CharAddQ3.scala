package Assignment1

object CharAddQ3 extends App{
  def add(str:String): String ={
    val length = str.length
    val lastChar = str.charAt(length-1)
    lastChar+ str + lastChar
  }

  println("output is :"+ add("Scala"))


}
