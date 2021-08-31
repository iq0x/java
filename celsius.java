public class celsiusfahrenheit 
{
	public static void main(String[] args) 
    {
        double a = 12.0;
        
        double b = fahrenheit(a);       
        myprint(b,"F");
        
        a = 53.5;
        
		b = celsius(a);
        myprint(b, "Grad");
    }    
    
 //-------------------------------------------------------   
 
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
    
    
	static void myprint(double zahl, String einheit) 
    {
        System.out.printf("%.1f %s%n", zahl, einheit);
    }
}
