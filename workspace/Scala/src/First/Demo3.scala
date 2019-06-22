package First
// Part - 46 Sets Part -2
object Demo3 {
   def main(args:Array[String])
  {
    var marks:Set[Int]=Set(10,35,99,66)
    var marks1=Set(10,20,88,99,66)
    println(marks.tail)
    println(marks.head)
    println(marks.last)
    var marks3=marks.++(marks1)
    println(marks3)
    println(marks.&(marks1))
    println(marks.intersect(marks1))
  }
}