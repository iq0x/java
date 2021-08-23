public class Main
{
    public static void main(String[] args)
    {
		System.out.println("loop 1");
		int x = 1;
		int result;
		
		
		while(x < 10)
		{
				int y = 0;
				while(y < 10)
				{
					y++;
					result = x * y;
					System.out.println(x +" * " + y + " = " + result);

				}	
				System.out.println();
				x++;	
		}
    }
}

