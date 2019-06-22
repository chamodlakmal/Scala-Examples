object demo{
	def main(args:Array[String]){
		var x = Array('A','A','A','A','A')
		var y = Array('B','B','B','B','B')
		var size = x.length+y.length
		var result = new Array[Char](size)
		for(i<- 0 to (size-1)){
			if(i%2==0){
				result(i)=x(i/2)
			}else{
				result(i)=y((i-1)/2)
			}
			
		}

		println("First Array")
		for(p <- x){
			print(p)
		}
		println("")
		println("Second Array")

		for(p <- y){
			print(p)
		}
	
		println("")
		println("Result Array")


		for(p <- result){
			print(p)
		}

	}
}