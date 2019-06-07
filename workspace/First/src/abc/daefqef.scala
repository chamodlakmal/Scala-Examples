package abc

object daefqef {
  object numbers{

	def thousand(n:Int) = {		
		var number = n/1000;	
		var temp = number;		
		if(100<=number && number<1000){
			hundred(number);
			temp = number%100;
			number = temp;
		}
		
		if(20<=number && number<100){
			double(number);
			temp = number%10;
			number = temp;
		}
		
		if(0<number && number<20){
			single(number);
		}
		print("thousand ");
	}

	def hundred(n:Int) = {		
		var number = n/100;
		single(number);
		print("hundred ");
	}
	
	def double(n:Int) = {		
		var number = n/10;
		number match {
			case 2 => print("twenty ");
			case 3 => print("thirty ");
			case 4 => print("fourty ");
			case 5 => print("fifty ");
			case 6 => print("sixty ");
			case 7 => print("seventy ");
			case 8 => print("eighty ");
			case 9 => print("ninety ");
			case _=> print(" ");
		}
	}
	
	def single(n:Int) = {
		n match {
			case 1 => print("one ");
			case 2 => print("two ");
			case 3 => print("three ");
			case 4 => print("four ");
			case 5 => print("five ");
			case 6 => print("six ");
			case 7 => print("seven");
			case 8 => print("eight ");
			case 9 => print("nine ");
			case 10 => print("ten ");
			case 11 => print("eleven ");
			case 12 => print("twelve ");
			case 13 => print("thirteen ");
			case 14 => print("fourteen ");
			case 15 => print("fifteen ");
			case 16 => print("sixteen ");
			case 17 => print("seventeen ");
			case 18 => print("eighteen ");
			case 19 => print("nineteen ");
			case _=> print(" ");
		}
	
	}

	def main(args: Array[String]){
		while(true){
			print("Enter your number : ");
			var number = scala.io.StdIn.readInt()
			print("Number in Words : ");
			var temp = number;
			if(0<=number && number<=100000){
				if(number == 0){
					print("zero");
				}
				
				if(1000<=number && number<=100000){
					thousand(number);
					temp = number%1000;
					number = temp;
				}
				
				if(100<=number && number<1000){
					hundred(number);
					temp = number%100;
					number = temp;
				}
				
				if(20<=number && number<100){
					double(number);
					temp = number%10;
					number = temp;
				}
				
				if(0<number && number<20){
					single(number);
				}			
			}
			
			else{
				print("Out of Limit");
			}
			
			print("\n\n");
		}
	}
}
}