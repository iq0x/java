public class Main
{
       public static void main (String[] args)
       {
			int punkte[] = {92, 80, 29, 81, 100, 66, 91, 50, 70, 82, 30, 85, 96, 67};	
				 
			int note1 = 0;
			int note2 = 0;
			int note3 = 0;
			int note4 = 0;
			int note5 = 0;
			int note6 = 0;
		
			for(int i = 1; i < punkte.length; i++)
			{
				System.out.println(punkte[i]);
				if (punkte[i] >= 92 && punkte[i] <= 100) { note1++; System.out.println("added....");}
				if (punkte[i] >= 81 && punkte[i] <= 91) { note2++; System.out.println("added....");}
				if (punkte[i] >= 67 && punkte[i] <= 80) { note3++; System.out.println("added....");}
				if (punkte[i] >= 50 && punkte[i] <= 66) { note4++; System.out.println("added....");}
				if (punkte[i] >= 30 && punkte[i] <= 49) { note5++; System.out.println("added....");}
				if (punkte[i] >= 0 && punkte[i] <= 29) { note6++; System.out.println("added....");}
			}	
			
			System.out.println();
			
			
			int noten[] = {note1, note2, note3, note4, note5, note6};	
			
			
			
			
				 
			for (int i = 0; i < 6; i ++) 
			{
			
				System.out.println(noten[i]);
			
			}
			
       }
}
