import java.util.Arrays;
import java.util.Random;

public class Main
{
		static String text0 = "nichts";
		static String text1 = "1 Dollar";
		static String text2 = "5 Dollar";
		static String text3 = "50.000 DOLLAR";
		static String text4 = "100.000 Dollar";
		static String text5 = "500.000 Dollar";
		static String text6 = "1.000.000";
		
	public static void main(String[] arg) 
	{
		int[] meinezahlen = {2, 8, 12, 17, 22, 35};
		int[] gewinnzahlen = new int[6]; 
		
		clrscr();
		System.out.print("Meine Zahlen: ");
		display(meinezahlen);
		
		System.out.print("Gewinnzahlen: ");
		display(ziehung(gewinnzahlen));
		
		System.out.print("\nRichtige: ");
		System.out.println(check(meinezahlen, gewinnzahlen));
		
		int richtige = check(meinezahlen, gewinnzahlen);
		
		gewinne();
		
		meingewinn(richtige);
	}


//-------------------------------------------------------------------
    static void meingewinn(int richtige)
	{
		String gewinntext = ""; 
		if (richtige == 0) gewinntext = text0;
		if (richtige == 1) gewinntext = text1;
		if (richtige == 2) gewinntext = text2;
		if (richtige == 3) gewinntext = text3;
		if (richtige == 4) gewinntext = text4;
		if (richtige == 5) gewinntext = text5;
		if (richtige == 6) gewinntext = text6;
		
		System.out.println("\nDu hast "+gewinntext+" gewonnen\n");
	}
    
    
    static void display(int [] array)
	{
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
   
   
    static int check(int [] meinezahlen, int [] gewinnzahlen)
	{
		int richtige = 0;
		for (int i = 0; i < gewinnzahlen.length; i++)
			for (int j = 0; j < meinezahlen.length; j++)
				if (meinezahlen[j] == gewinnzahlen[i])
					richtige += 1;
					
		return richtige;
	}
	

	static int [] ziehung(int [] gewinnzahlen)
	{
	
		int tmp;
		
		buffer:
			for (int i = 0; i < 6; i++) {
				tmp = (int) (Math.random() * 49)+1; 
				if(tmp == 0) {
					continue buffer;
				}   
				for (int x = 0; x < i; x++) {
					if (gewinnzahlen[x] == tmp ) 
					{
						tmp = (int) (Math.random() * 50);
						x = -1;
					}
				}
				gewinnzahlen[i] = tmp;
			}
        return gewinnzahlen;
	}
	
	
	static void gewinne()
	{
		System.out.println("\n=================================");
		System.out.println("Richtige: 0 = "+text0);
		System.out.println("Richtige: 1 = "+text1);
		System.out.println("Richtige: 2 = "+text2);
		System.out.println("Richtige: 3 = "+text3);
		System.out.println("Richtige: 4 = "+text4);
		System.out.println("Richtige: 5 = "+text5);
		System.out.println("Richtige: 6 = "+text6);
		System.out.println("=================================");
	}
	
	
	static void clrscr()
	{
		System.out.print("\033[H\033[2J"); 
		System.out.flush();
	}
}
