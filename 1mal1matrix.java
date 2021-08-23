public class Main
{
    public static void main(String[] args)
    {
		int x = 1;
		int result;
		
		
		while(x <= 10)
		{
				int y = 1;
				while(y <= 10)
				{
					result = x * y;
					System.out.print(y*x+"\t");
					y++;

				}	
				System.out.println();
				System.out.println("");
				x++;	
		}
    }
}
