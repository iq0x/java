public class celsiusfahrenheit 
{
	public static void main(String[] args)
    {
        double celsius = 6.0;    
        display(fahrenheit(celsius), "F");
        
        double fahrenheit = 53.5;
        display(celsius(fahrenheit), "Grad");
    }    
    
 //-------------------------------------------------------------------   
 
    static double celsius(double zahl) 
    {
        double ergebnis = ((zahl-32) * 5/9);
        return ergebnis;
    }
    
    
    static double fahrenheit(double zahl) 
    {
        double ergebnis = zahl * 9 / 5 + 32;
        return ergebnis;
    }
    
    
	static void display(double zahl, String einheit) 
    {
        System.out.printf("%.1f %s%n", zahl, einheit);
    }
}
