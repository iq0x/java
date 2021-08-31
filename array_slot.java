import java.util.Random;

public class Main
{
       public static void main (String[] args)
       {
			int[] slots;
			
			slots = new int[11];
	
			int max = slots.length;
			
			Random rand = new Random();
			  
			while (true)
			{
				System.out.print("\033[H\033[2J"); 
				System.out.flush();  
				
				for(int i: slots)
				{
					slots[i] = rand.nextInt(9);		
				}
			
				
				for (int i = 0; i < max; i++)
					System.out.print("╔═══════╗");
				System.out.println(); 
				for (int i = 0; i < max; i++)
					System.out.print("║       ║");
				System.out.println(); 
				for (int i = 0; i < max; i++)
					System.out.print("║ "+" " +" "+slots[i]+" "+" "+" ║");
				System.out.println(); 
				for (int i = 0; i < max; i++)
					System.out.print("║       ║");
				System.out.println(); 
				for (int i = 0; i < max; i++)
					System.out.print("╚═══════╝");
				System.out.println(); 
				
				
				if (slots[0] ==  slots[1])
				{
					System.out.println("f1 = f2");
					if (slots[1] ==  slots[2])
						System.out.println("f1 = f2 = f3");
					else 
						System.out.println("f1 = f2 != f3");
				}
				else
				{
					System.out.println("f1 != f2");
				}
				try{Thread.sleep(200);}catch(InterruptedException e){System.out.println(e);}
				
			}	
       }
}
