package First
//Part - 34 Assignment Operators
object Assignment {
  // = , += , -= , *= , /= , %= , <<= , >>= , &= ,|= , ^=
  def main(args:Array[String])
  {
    val a=30;
    val b=2;
    var c=b
    println(c)
    c+=b // c=c+b
    println(c)
    c-=b; // c=c-b
    println(c)
    c*=b //c=c*b
    
    c|=b // c=c|b
    
    
  }
    
}