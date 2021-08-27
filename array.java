
import java.util.Arrays;

public class Main
{
       public static void main (String[] args)
       {
			double preis1 = 1.99;
			double preis2 = 4.99;
			
			int count = 0;
		
			double[] feld;
			
			feld = new double[7];
			
			feld[2] = preis2;
			feld[0] = preis1;
		
			while (count < feld.length)
			{
				System.out.println(feld[count]);
				if (feld[count] > 3)
					System.out.println("z < 3");
					
				count++;
			}
			
			
			//---------------------------------------
			
			
			String s = Arrays.toString(feld);
			System.out.println("\n"+s);
				
				
			//---------------------------------------	
			
			
			String[] feldname;
			
			feldname = new String[7];
			
			feldname[2] = "helmut";
			feldname[0] = "bernd";
			
			feldname[2] = feldname[2].replace("helmut", "Borris");;
			
			System.out.println("\n"+Arrays.toString(feldname));
			System.out.println();
			
			
			//---------------------------------------
			
			
			double preisA1 = 1.99;
			double preisA2 = 4.99;
			
			count = 0;
		
			double[] feldA;
			
			feldA = new double[7];
			
			feldA[2] = preisA2;
			feldA[0] = preisA1;
		
			while (count < feldA.length)
			{
				System.out.println(feldA[count]);			
				count++;
			}
			System.out.println();
			
			
			//-----------------enhanced for loop ----------------------
			
			for(double value: feldA)
			{
				System.out.println(value);		
			}
			System.out.println();	
			
			
			
			//-----------------kalender ----------------------	
			
			//String[] wochentage = new String[7]
			//wochntage[0] = "Montag";
			
			String[] wochentage = {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
			
			for (String alle: wochentage)
				System.out.println(alle);
				
				
			
       }
}


