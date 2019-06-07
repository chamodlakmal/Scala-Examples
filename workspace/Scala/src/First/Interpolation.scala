package First
//Part - 39    STRING INTERPOLATION
object Interpolation {
   def main(args:Array[String])
  {
     val name="ChamiViews"
     val age=21
     val salary=222.5d
     println("name ="+name)
     println(s"name = $name age = $age")
     println(f"name = $name%s age = $age%d salary $salary%f")
     println(raw"a \t b")
  }
}