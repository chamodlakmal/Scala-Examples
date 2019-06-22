object demo{
	def main(args:Array[String]){
		val array1 = Array(1,2,3,4,5,6,7)
		val array2 = Array(10,20,30,40,50)
		var x=array2.length+array1.length;
		var array3 = new Array[Int](x)
		for(i <- 0 to (x-1)){
			if(i<(array1.length)){
				array3(i)=array1(i)
			}else{
				array3(i)=array2(i-(array1.length))
			}
		}

		for(x <- array3){
			println(x)
		}
	}
}