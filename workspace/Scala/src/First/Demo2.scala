package First
// Part - 44 Map Part - 02
object Demo2 {
  
   def main(args:Array[String])
  {
     var names:Map[Int,String]=Map(1->"Nimal",2->"Sunil")
     println(names)
     names+=3->"Kamal"
     println(names(3))
     println(names.keys)
     println(names.values)
     println(names.isEmpty)
     println(names.contains(5))
     
  }
}