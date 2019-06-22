object demo {

	def main (args:Array[String]){

		var x = new Array[Int](12)
		var a=scala.io.StdIn.readInt()
		var index = 0
		if(a==0){
			print(a)
		}else{
			while(a!=0){
			x(index)=a%2
			index=index+1
			a=a/2
				}	
		}

		var x2= new Array[Int](index)
		for(i <- 0 to (index-1)){
			x2(i)=x(index-1-i)
		}

		for(i <- x2){
			print(i)
		}
	}
}