package First
//Part - 27 Nested Function
object Nested {
   
  def add(a:Int,b:Int,c:Int):Int=
  {    
    def add1(x:Int,y:Int):Int=
    {
      x+y
    }
    add1(a,add1(b,c))
  }
  
  def main(args: Array[String]) {
   var x= add(20,5,5)
   println(x)   
  }  
}