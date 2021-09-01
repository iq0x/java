public class celsiusfahrenheit 
{
	public static void main(String[] args)
    {
        double celsius = 6.0;   
        double fahrenheit = 53.5;
          
        display(fahrenheit(celsius), "F");
        display(celsius(fahrenheit), "Grad");
    }    
    
 //-------------------------------------------------------------------   
 
    static double celsius(double x) 
    {
        double result = ((x-32) * 5/9);
        return result;
    }
    
    
    static double fahrenheit(double x) 
    {
        double result = x * 9 / 5 + 32;
        return result;
    }
    
    
	static void display(double x, String einheit) 
    {
        System.out.printf("%.1f %s%n", x, einheit);
    }
}


