import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		int count = 0;
		int dez = 0;
		
		Scanner blub = new Scanner(System.in);
		System.out.print("zahl-b\tbinär\nzahl-d\tdezimal\n-help\thilfe\n");
		System.out.print("--------------------\ngive me the shit: \n--------------------\n");

		String zahl = blub.nextLine();		
		
		if(!zahl.isEmpty())
		{
			if(zahl.contains("-d"))
			{
				zahl = zahl.replace("-d", ""); 
				if (zahl.matches("[0-1]+"))
				{
					Integer input = Integer.valueOf(zahl);
					while(input != 0)
					{
						dez += ((input % 10)) * Math.pow(2,count);
						input /= 10;  
						count++;
					}
					System.out.println("dezimal: " + dez);
					
				}
				else
				{
					System.out.println("das ist keine binärzahl!");
				}
			}
			
			if(zahl.contains("-b"))
			{
				
				zahl = zahl.replace("-b", ""); 
				if (zahl.matches("[0-1]+"))
				{
					Integer input = Integer.valueOf(zahl);
					System.out.print("binär: ");
					while(input!=0)
					{
						if(input % 2 == 0) {input /= 2; System.out.print(0);}
						else if(input % 2 == 1) {input /= 2; System.out.print(1);}	
					}
					System.out.println();
				}
				else
				{
					System.out.println("das ist keine dezimalzahl!");
				}
			}
			
			if(zahl.contains("-help"))
			{
				System.out.println("lol dir ist nicht zu helfen xDDD");
			}
		}
		else
			System.out.println("unbekannter befehl");
	}
}


