public class Main
{
       public static void main (String[] args)
       {
			int punkte[] = {55, 33, 34, 81, 34, 66, 55, 50, 66, 82, 66, 85, 34, 67};	
			int durch = 0;
				 
			int note1 = 0;
			int note2 = 0;
			int note3 = 0;
			int note4 = 0;
			int note5 = 0;
			int note6 = 0;
		
			for(int i = 1; i < punkte.length; i++)
			{
				//System.out.println(punkte[i]);
				if (punkte[i] >= 92 && punkte[i] <= 100) { note1++;}
				if (punkte[i] >= 81 && punkte[i] <= 91) { note2++;}
				if (punkte[i] >= 67 && punkte[i] <= 80) { note3++;}
				if (punkte[i] >= 50 && punkte[i] <= 66) { note4++;}
				if (punkte[i] >= 30 && punkte[i] <= 49) { note5++;}
				if (punkte[i] >= 0 && punkte[i] <= 29) { note6++;}
				durch += punkte[i];
			}	
			
			
			System.out.println();
			
			
			for (int tab1 = 0; tab1 <= 41; tab1++)
			{	
				if (tab1 == 0)	
					System.out.print("\u2554");
				if (tab1 == 42)	
					System.out.print("\u2557");
				if (tab1 == 7 || tab1 == 14 || tab1 == 21 || tab1 == 28 || tab1 == 35)
					System.out.print("\u2566");
					
				System.out.print("\u2550");
				
			}
			System.out.print("\u2557");
			System.out.println();
			System.out.println("\u2551"+ 1+ "\t" +"\u2551"+ 2 +"\t"+"\u2551"+ +3+"\t"+"\u2551"+ +4+"\t"+"\u2551"+ +5+"\t"+"\u2551" +6+"\t"+"\u2551");
				
			
			for (int tab1 = 0; tab1 <= 41; tab1++)
			{	
				if (tab1 == 0)	
					System.out.print("\u2560");
				if (tab1 == 42)	
					System.out.print("\u2563");
				if (tab1 == 7 || tab1 == 14 || tab1 == 21 || tab1 == 28 || tab1 == 35)
					System.out.print("\u256C");
						
				System.out.print("\u2550");
					
			}
			System.out.print("\u2563");
			System.out.println();
				
			int noten[] = {note1, note2, note3, note4, note5, note6};	
			
					
				 
			for (int i = 0; i < 6; i ++) 
			{
				System.out.print("\u2551"+ noten[i]+ "\t");	
				
			}
			System.out.print("\u2551");
			System.out.println();
			
	
			for (int tab1 = 0; tab1 <= 41; tab1++)
			{	
				if (tab1 == 0)	
					System.out.print("\u255A");
				if (tab1 == 7 || tab1 == 14 || tab1 == 21 || tab1 == 28 || tab1 == 35)	
					System.out.print("\u2569");
				if (tab1 == 42)	
					System.out.print("\u255D");
						
				System.out.print("\u2550");
		
			}
			System.out.print("\u255D");
			System.out.println();
			System.out.println("duchscnitt: "+durch/punkte.length+" Pkt");
			System.out.println();
				
       }
}

