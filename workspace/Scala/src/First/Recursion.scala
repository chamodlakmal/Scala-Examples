package First
//Part - 26 Recursion Function
/*
  3!=3*2*1
  4!=4*3*2*1
  5!=5*4*3*2*1
  0!=1
  */
object Recursion {
  def main(args:Array[String])
    {
         var value=factorial(4)  
         println(value)
    }
  
  def factorial(n:Int):Int=
  {
    if(n==0)
    {
      return 1
    }else
    {
      return n*factorial(n-1)
    }
  }
  
}