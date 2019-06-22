object demo{
	def main(args:Array[String]){
		var p=Array(1,2,-1,4,5,6);
		var avg:Double=0.0;
		var total:Double=0
		var position=0
		var max=p(0);
		 for ( x <- 0 to (p.length-1) ) {
         	println( p(x) )
         	total=total+p(x)

         	if(p(x)<=max){
         		 position=x;
         	}else
      				max=p(x)
         	
      		}
 
      	avg=total/p.length;

      	println(total)
      	println(p.length)
      	println(avg)
      	println(position)
	}
}