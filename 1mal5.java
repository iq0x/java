public class Main
{
    public static void main(String[] args)
    {
		System.out.println("loop 1");
		int i = 1;
		int n = 10;
		int result;
		
		while(i < n)
		{
				i++;	
				result = i*5;
				System.out.println(i +" * 5 = " + result);
		}	
    }
}
