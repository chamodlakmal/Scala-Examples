package First

import scala.io.Source

object Assignment2 {
  def main(args:Array[String])
  {
     var allWords: Map[Int, String] = Map()
     var i=0
    val words = """([A-Za-z])+""".r
   for (line <- io.Source.fromFile("C:/Users/chamo/OneDrive/Desktop/lorem.txt").getLines().flatMap(words.findAllIn).toList) {
    i+=1;
    allWords+=(i->line)
     
  }
      var countWords: Map[String, Int] = Map()
      var k=0;
     println("Total word count is = "+i)
     for(q<- 1 to i)
     {
         for(p<- 1 to i)
       {
         if(allWords(p)==allWords(q))
         {
           k+=1;           
         }
          
     }
         countWords+=(allWords(q)->k)
           k=0
         
     }
     countWords.keys.foreach{ i =>  
         print( i )
         println(" -- > Number of count = " + countWords(i) )
   }
     
  }
}