import java.util.Random;

public class Main
{
	
	public static void main (String[] args)
	{
		int versuche = 100000;
		int MAX = 9;
		int GAMEOVER = 0;
		int wait = 200;
		
		int[] slots;
		slots = new int[MAX];
		
				  
		while (versuche > GAMEOVER)
		{
			try{Thread.sleep(wait);}catch(InterruptedException e){System.out.println(e);}
			versuche--;
			System.out.print("\033[H\033[2J"); 
			System.out.flush();  
			
			titel();		
			displaySlots(slots);
			displayVersuche(versuche);
		}
	}	
	
	
//----------------------------------------------------------------------------------


	static void displayVersuche(int versuche) 
	{ 
        	System.out.println("╔═══════════════╗");
			System.out.println("║Versuche: "+ versuche + "║");
			System.out.println("╚═══════════════╝");
    }
       
	static void titel()
	{
		System.out.println("\n\n\t\t\tWilkommen Spielsüchtiger!!!!!!!!!!!!\n\n");
		System.out.println("█████████████████████████████████████████████████████████████████████████████████");
		System.out.println("██             ╔════  ║    ╔═══╗ ══╦══       ╔═══╗ ╔═══╗ ╔════ ╔════           ██");
		System.out.println("██            ╔════  ║    ╔═══╗ ══╦══       ╔═══╗ ╔═══╗ ╔════ ╔════            ██");
		System.out.println("██            ╚═══╗  ║    ║   ║   ║         ║   ║ ╠═══╣ ╚═══╗ ╠════            ██");
		System.out.println("██            ════╝  ╚═══ ╚═══╝   ║         ╚═══╝ ║   ║ ════╝ ╚════            ██");
		System.out.println("█████████████████████████████████████████████████████████████████████████████████");
	}
	
	
	 static void displaySlots(int[] slots) 
	 {
		Random rand = new Random();
		int max = slots.length;
		
		
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
		
		
				
		if (slots[0] ==  slots[1])
		{
			System.out.println("\n\t\t\t\tf1 = f2");
			if (slots[1] ==  slots[2])
				System.out.println("\n\t\t\t\tf1 = f2 = f3");
			else 
				System.out.println("\n\t\t\t\tf1 = f2 != f3");
		}	
       
	}
 }
 


