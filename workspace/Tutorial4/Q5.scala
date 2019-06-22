object demo{

	def main(args:Array[String]){
		println("Type Your Word : ")
    	val input = scala.io.StdIn.readLine()
    	var text=input.reverse
    	println(text)
	}
}