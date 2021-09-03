package Assignment1

object HappyorNotQ7 extends App{

  def find(str: String, a:Int): String = {


        if (str.charAt(a) == str.charAt(a - 1)) "happy"
        else if (str.charAt(a) == str.charAt(a + 1)) "happy"
        else
          "not happy"
      }
var str = "apple"
val a = 2
println(find(str,a))
}
