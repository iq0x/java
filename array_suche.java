public class Main
{
       public static void main (String[] args)
       {
			
			String[] fields = new String[] { "sergio","oliver","emre","dario","misterx"};
			String suchen = "sergio";

			for (int i = 0; fields[i].equals(suchen) || fields.length == 0; i++)
			{
				System.out.println("hab dich");	
			}
       }
}
