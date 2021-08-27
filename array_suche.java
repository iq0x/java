import java.util.Arrays;

public class Main
{
       public static void main (String[] args)
       {
		
			String[] fields = new String[] { "sergio","oliver","emre","dario","misterx"};
			String suchen = "misterx";

			for(int i = 0; i < fields.length; i++)
			{
				if(fields[i].equals(suchen))
				{
				
					System.out.println("hab dich");
				}
			}
			
       }
}
