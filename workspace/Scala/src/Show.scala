//Part - 38 Multi-Dimensional Arrays Part-2
object Show {
   def main(args:Array[String])
  {   
     //var x=Array.ofDim[Int](3,3)
     var x=Array(Array(1,2,3),Array(4,5,6),Array(7,8,9))
     
     for(i <- 0 to 2)
     {
       for(j <- 0 to 2)
       {
         print(" "+x(i)(j))
       }
       println()
     }
     
     
  }
      
}