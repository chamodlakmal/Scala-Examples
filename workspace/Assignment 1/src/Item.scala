

object Item {
   def main(args:Array[String])
   {
     var itemCount1=5;
     var itemCount2=5;
     var itemCount3=5;
     var priceItem1=10;
     var priceItem2=20;
     var priceItem3=30;
     do
     {
        println("----------------------------MENU--------------------------");
        println("Item1 Count = "+itemCount1+" Price per Item = "+priceItem1);
        println("Item2 Count = "+itemCount2+" Price per Item = "+priceItem2);
        println("Item3 Count = "+itemCount3+" Price per Item = "+priceItem3);
        println("Enter your Item Number You want to Buy : ");
        var itemNumber=scala.io.StdIn.readInt();
        itemNumber match {
          case 1 => println("Enter number of items Do you want Item1 :");
                    var delCount1=scala.io.StdIn.readInt();
                    if(delCount1>itemCount1)
                    {
                      println("You can't buy "+delCount1+" You can buy "+itemCount1+" Items");
                    }
                    else
                    {
                      itemCount1=itemCount1-delCount1;
                      var price=priceItem1*delCount1;
                      println("Success");
                      println("Price ="+ price);
                    }
          case 2 => println("Enter number of items Do you want Item2 :");
                    var delCount2=scala.io.StdIn.readInt();
                    if(delCount2>itemCount2)
                    {
                      println("You can't buy "+delCount2+" You can buy "+itemCount2+" Items");
                    }
                    else
                    {
                      itemCount1=itemCount2-delCount2;
                      var price=priceItem2*delCount2;
                      println("Success");
                      println("Price ="+ price);
                    }
          case 3 => println("Enter number of items Do you want Item3 :");
                    var delCount3=scala.io.StdIn.readInt();
                    if(delCount3>itemCount3)
                    {
                      println("You can't buy "+delCount3+" You can buy "+itemCount3+" Items");
                    }
                    else
                    {
                      itemCount1=itemCount3-delCount3;
                      var price=priceItem3*delCount3;
                      println("Success");
                      println("Price ="+ price);
                    }
          case _ => println("Invalid Input");
      } 
    
       
     }
     while(!(itemCount1<1&&itemCount2<1&&itemCount3<1));
    
   }
  
}