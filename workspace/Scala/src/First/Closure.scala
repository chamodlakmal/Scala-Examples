package First
//Part - 29 Closures
object Closure {
  def main(args:Array[String])
    {
       println(cExample(50)) //Calling the function
    }
  val value=10;
  val a=20;
  def cExample(x:Int):Int=
  {
    var sum=x+value-a;
    return sum
  }
}