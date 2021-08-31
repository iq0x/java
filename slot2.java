import java.util.Random;

public class Main
{
	
	public static void main (String[] args)
	{
	int[] slots;
	int versuche = 100000;
			
	slots = new int[9];
	
	int max = slots.length;
			
	Random rand = new Random();
			  
	while (versuche > 0)
	{
		versuche--;
		System.out.print("\033[H\033[2J"); 
		System.out.flush();  
		titel();
				
		for(int i: slots)
			slots[i] = rand.nextInt(9);		
		
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
		System.out.println("\n\n\t\t\t\t"+"Versuche: "+ versuche);	
				
		if (slots[0] ==  slots[1])
		{
			System.out.println("\n\t\t\t\tf1 = f2");
			if (slots[1] ==  slots[2])
				System.out.println("\n\t\t\t\tf1 = f2 = f3");
			else 
				System.out.println("\n\t\t\t\tf1 = f2 != f3");
				}
				else
				{
					System.out.println("\n\t\t\t\tf1 != f2");
				}
				try{Thread.sleep(200);}catch(InterruptedException e){System.out.println(e);}
			}	
       }
       
	static void titel()
	{
		System.out.println("\n\n\t\t\tWilkommen Spielsüchtiger!!!!!!!!!!!!\n\n");
		
		System.out.println("            ╔════  ║    ╔═══╗ ══╦══       ╔═══╗ ╔═══╗ ╔════ ╔════");
		System.out.println("           ╔════  ║    ╔═══╗ ══╦══       ╔═══╗ ╔═══╗ ╔════ ╔════");
		System.out.println("           ╚═══╗  ║    ║   ║   ║         ║   ║ ╠═══╣ ╚═══╗ ╠════");
		System.out.println("           ════╝  ╚═══ ╚═══╝   ║         ╚═══╝ ║   ║ ════╝ ╚════");
		System.out.println();
		System.out.println("██████████████████████████████████████████████████████████████████████████████████");
	}
}
