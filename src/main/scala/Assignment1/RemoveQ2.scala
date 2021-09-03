package Assignment1

object RemoveQ2 extends App{
  def remove(str: String, x:Int):String ={
    str.take(x) + str.drop(x+1)
  }

  println("out :" + remove("Scala",1))
  println("out :" + remove("Scala",0))
  println("out :"+ remove("Scala", 4 ))

}
