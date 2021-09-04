import java.util.Arrays;
import java.util.Random;

public class Main{

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
		if (richtige == 0) gewinntext = "nichts";
		if (richtige == 1) gewinntext = "1 Dollar";
		if (richtige == 2) gewinntext = "5 Dollar";
		if (richtige == 3) gewinntext = "50.000 DOLLAR";
		if (richtige == 4) gewinntext = "100.000 Dollar";
		if (richtige == 5) gewinntext = "500.000 Dollar";
		if (richtige == 6) gewinntext = "1.000.000 Dollar";
		
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
	
		int randomNum;
		
		go:
			for (int i = 0; i < 6; i++) {
				randomNum = (int) (Math.random() * 50); 
				if(randomNum == 0) {
					continue go;
				}   
				for (int x = 0; x < i; x++) {
					if (gewinnzahlen[x] == randomNum ) 
					{
						randomNum = (int) (Math.random() * 50);
						x = -1;
					}

				}
				gewinnzahlen[i] = randomNum;
			}
        return gewinnzahlen;
	}
	
	
	static void gewinne()
	{
		System.out.println("\n=================================");
		System.out.println("Richtige: 0 = NICHTS lol");
		System.out.println("Richtige: 1 = 1 DOLLAR");
		System.out.println("Richtige: 2 = 5 DOLLAR");
		System.out.println("Richtige: 3 = 50.000 DOLLAR");
		System.out.println("Richtige: 4 = 100.000 DOLLAR");
		System.out.println("Richtige: 5 = 200.000 DOLLAR");
		System.out.println("Richtige: 6 = 1.000.000 DOLLAR");
		System.out.println("=================================");
	}
	
	
	static void clrscr()
	{
		System.out.print("\033[H\033[2J"); 
		System.out.flush();
	}
}
