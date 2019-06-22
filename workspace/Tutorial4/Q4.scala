object demo {

	def main(args:Array[String]){

		println("Type Your Word : ")
    	val input = scala.io.StdIn.readLine()
    	var p = input.toArray
    	var flag=0;
    	for(i <- 0 to (p.length+1)/2){
    		if(p(i)==p(p.length-i-1)){

    		}else{
    			flag=1
    		}
    	}

    	if(flag==1){
    		println(input+" is not a palindrom")
    	}else{
    		println(input+" is a palindrom")
    	}

	}
}