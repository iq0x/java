import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		int count = 0;
		int dez = 0;
		
		Scanner blub = new Scanner(System.in);
		System.out.print("-b\tbinär\n-d\tdezimal\n-help\thilfe\n");
		System.out.print("--------------------\ngive me the shit: \n--------------------\n");

		String zahl = blub.nextLine();		
		
		if(!zahl.isEmpty())
		{
			if(zahl.contains("-b"))
			{
				zahl = zahl.replace("-b", ""); 
				Integer input = Integer.valueOf(zahl);
				while(input != 0)
				{
					dez += ((input % 10)) * Math.pow(2,count);
					input /= 10;  
					count++;
				}
				System.out.println("dezimal: " + dez);
			}
			
			if(zahl.contains("-d"))
			{
				zahl = zahl.replace("-d", ""); 
				Integer input = Integer.valueOf(zahl);
				System.out.print("binär: ");
				while(input!=0)
				{
					if(input % 2 == 0) {input /= 2; System.out.print(0);}
					else if(input % 2 == 1) {input /= 2; System.out.print(1);}	
				}
				System.out.println();
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

