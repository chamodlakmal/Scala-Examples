package First
// Part - 42 List ---> Part - 3
object Demo1 {
  def main(args:Array[String])
  {    
     var numbers:List[Int]=List(10,20,30)
     println(numbers)
     var number1:List[List[Int]]=List(List(1,2,3),
         List(10,20,30),List(100,200,300))
         println(number1)
         println(number1(0)(0))
         println(number1(0)(1))
         println(number1(1)(0))
         println(number1(2)(1))
     
  }
}