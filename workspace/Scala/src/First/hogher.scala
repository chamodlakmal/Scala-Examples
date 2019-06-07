package First

object hogher {
   def main(args: Array[String]): Unit = {
      functionExample(25, multiplyBy2)
  }
   def functionExample(a:Int, f:Int=>AnyVal):Unit = {
    println(f(a)) // Calling that function
    }
def multiplyBy2(a:Int):Int = {
a*2
}
}