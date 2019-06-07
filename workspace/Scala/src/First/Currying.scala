package First
//Part - 28 Currying Function

object Currying {
  def main(args:Array[String])
    {
           println(sub(5)(2)) 
           println(sub2(4)(2))
    }
  def sub(x:Int)=(y:Int)=>x-y
  
  def sub2(x:Int)(y:Int)=x-y
  
}