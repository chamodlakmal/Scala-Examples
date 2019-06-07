package First

//Part-24 Higher-Order Function Part-02

object Higher {
   def main(args: Array[String]) {
         hExample(4,2,(a,b)=>a*b)
  }
   def hExample(x:Int,y:Int,f:(Int,Int)=>Int)
   {
     val value=f(x,y) //calling the function
     println(value)
   }
   
   
   
}