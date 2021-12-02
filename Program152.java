import java.util.*;
class Stringx
{ 
public String str;//charcterstics


 public void Accept()//set method
 { Scanner sobj = new Scanner(System.in);
 System.out.println("enter string");
 str= sobj.nextLine();
 }
 public void Display()//get method
 {
	 System.out.println("String is: "+str);
 }
}
class Program152
{
  public static void main(String arg[])
  {
	  
	  Stringx sobj= new Stringx();
	  sobj.Accept();
	  sobj.Display();
   }
}