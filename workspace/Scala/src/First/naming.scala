package First

object naming {
  def main(args:Array[String])
  {
    def ArticleCounts(i: => Int)  
        { 
            println("Tanya did articles " +  
                    " on day one is 1 - Total = " + i) 
            println("Tanya did articles "+  
                    "on day two is 1 - Total = " + i) 
            println("Tanya did articles " +  
                    "on day three is 1 - Total = " + i) 
            println("Tanya did articles " +  
                    "on day four is 1 - Total = " + i) 
        } 
  
        var Total = 0; 
          
        // calling function 
        /*ArticleCounts  
        { 
            Total += 1 ; Total 
        } */
  }
  
}