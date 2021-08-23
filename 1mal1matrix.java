public class Main
{
    public static void main(String[] args)
    {
		int x = 1;
	
		while(x <= 10)
		{
				int y = 1;
				while(y <= 10)
				{
					System.out.print(y*x+"\t");
					y++;

				}	
				System.out.println();
				System.out.println("");
				x++;	
		}
    }
}

