
object One {
  def main(args:Array[String])
  {
    print("Enter the word : ")
    var x=scala.io.StdIn.readLine();
    var length=x.length();
    var vowelCount=0;
    var a=0;
    var e=0;
    var i=0;
    var o=0;
    var u=0;
    println("Length of the string : "+length)
    for(j<-0 until length)
    {
      if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u')
      {
        vowelCount+=1;
        x.charAt(j) match {
          case 'a' => a+=1
          case 'e' => e+=1
          case 'i' => i+=1
          case 'o' => o+=1
          case 'u' => u+=1
          case _ =>
        }
        
      }
    }
    println("Total vowel Count =" +vowelCount);
    println("Number of a's = "+a)
    println("Number of e's = "+e)
    println("Number of i's = "+i)
    println("Number of o's = "+o)
    println("Number of u's = "+u)
  }
}