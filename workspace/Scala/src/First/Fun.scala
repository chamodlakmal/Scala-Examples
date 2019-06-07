package First

object Fun {
   def main(args:Array[String])
   {
       print();
       delayed(time());
   }
   def show():Int={
     
     return 1;
   }
   
   def print():Unit=
   {
     println("Hello")
   }
   def time() = {
     println("Getting time in nano seconds")
      System.nanoTime
   }
   def delayed( t: => Long ) = {
      println("In delayed method")
      println("Param: " + t)
      println("Param: " + t)
   }
     
}