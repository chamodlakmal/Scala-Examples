package First
//Part - 33 Bitwise Operators
object Bitwise {
  // & , | , ^ , ~ , << , >> , >>>(Shift Right zero fill)
  def main(args:Array[String])
  {
    val a=60; // 0011 1100
    val b=13; // 0000 1101
    println(a & b)
    println(a | b)
    println(a ^ b)
    println(~a)
    println(a<<2)
    println(a>>2)
    println(a>>>2)
    
    
  }
  
}