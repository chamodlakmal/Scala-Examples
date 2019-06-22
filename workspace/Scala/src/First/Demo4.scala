package First
// Part - 47 Queue 
import scala.collection.mutable._
object Demo4 {
   def main(args:Array[String])
  {
     var marks1=Queue(1,2,3)
     var marks2:Queue[Int]=Queue(10,20,30)
     marks1.enqueue(10)
     println(marks1)
  }
}