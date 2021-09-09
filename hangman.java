import java.util.Random;
import java.util.Scanner;

public class main 
{  
    public static void main (String args[])
    {   
		int life = 10;
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
            
		String[] wordlist = { "helloman", "affenkopf"};
		String word = wordlist[random.nextInt(wordlist.length)];
            
		char[] letters = word.toCharArray(); 
		char[] encrypt = word.toCharArray();
            
		for(int i = 0; i < encrypt.length; i++)
		{
			encrypt[i] = '_';
			System.out.print(encrypt[i] + " ");
		}
		System.out.println();
			
		for (int i = 1; i <= life; i++)
		{
			System.out.print("Your Letter:");
			char myinput = input.next().charAt(0);
			

			for (int j = 0; j < letters.length; j++)
			{
				if(myinput == letters[j])
				{
					encrypt[j] = myinput;
					System.out.println("Juhu gefunden");
				}
				else
				{
					
				}
				
			}
			
			
			for(int z = 0;z < encrypt.length; z++)
			{
				System.out.print(encrypt[z] + " ");
			}
						
			life--;
			
			System.out.println("Falsche Noch "+ life + " Versuch NR" );
				
			if (life == 0)
			{
				System.out.print("GAME OVER");
			}
				
			if((new String(word)).equals(new String(encrypt))) 
			{
				System.out.println("voll gut ey");
				break;
			}
			i++;
		}
	}
}
