package First
//Part-25 Partially Applied Functions
object Partially {
  def main(args: Array[String]) {
      var x=mul(2,_:Int,_:Int)  
      println(x(3,2))
      println(x(4,3))
  }
  
  def mul(x:Int,y:Int,z:Int):Int=
  {
    x*y*z;
  }
}