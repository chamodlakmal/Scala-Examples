package First
// Part - 49 
object Demo5 {
  def main(args:Array[String])
  {
    val myTuple=(1,12.5,"ChamiViews",true,(4,"Hello"))
    val tuple1=new Tuple3(1,2,3)
    println(myTuple._1)
    println(myTuple._2)
//    myTuple.productIterator.foreach
//    {
//      i=>println(i)
//    }
    println(myTuple._5._1)
    println(myTuple._5._2)
  }
}