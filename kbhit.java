import java.io.*;

public class Main
{
       public static void main (String[] args)
       {
			kbhit();
       }
       
       static void kbhit()
       {
		   	System.out.println("Press any key!!!");
			try 
			{
				System.in.read();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
	   }
}
