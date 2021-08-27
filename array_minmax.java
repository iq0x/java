import java.util.Arrays;

public class Main
{
       public static void main (String[] args)
       {
		int zahlen[] = {2, 3, 1, 0, 2};		 
   
		int max = zahlen[0];
		int min = zahlen[0];
		
		for(int i = 1; i < zahlen.length; i++)
		{
		  if(max < zahlen[i])
		  {
			max = zahlen[i];
		  }
		  else if(min > zahlen[i])
		  {
			min = zahlen[i];
		  }		   		   
		}
		System.out.println("max = " + max + " \nmin = " + min);	
       }
}
