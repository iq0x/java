public class Main
{
       public static void main (String[] args)
       {
			
			int zahlen[] = {55, 33, 34, 81, 34, 66, 55, 50, 66, 82, 66, 85, 34, 67};	
			int balken = 0;
			
			
			for(int i = 0; i < zahlen.length; i++)
			{
				int j = 0;
				while (j < zahlen[i])
				{
					j++;
					if (zahlen[i] % 2 == 0)
					{
						System.out.print("\u2588");
					}
					else
						System.out.print("-");
					
					try{Thread.sleep(5);}catch(InterruptedException e){System.out.println(e);}
				}
				System.out.print(" "+zahlen[i] +"%");
				System.out.println();
			}	
			
       }
}

