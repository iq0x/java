import java.util.Arrays;

public class Main{

    public static void main(String[] args)
    {
		clrscr();
		
        int[] punkte = punkte();
        int[] noten = noten();
        
        int[] notenNEW = sort(punkte, noten);
        
		Notenspiegel(notenNEW);
		
		display(mittelwertPunkte(punkte));
		display(mittelwertNoten(notenNEW));
		
		legende(notenNEW);
    }

//--------------------------------------------------------------------

	static void display(int x) 
	{
        System.out.println(x);
    }
    
    static int[] punkte()
    {
        int[] punkte = {13, 26, 93, 54, 72, 72, 76, 99, 89, 35, 22};
        return punkte;
    }
    
    static int[] noten()
    {
        int[] noten = {0, 0, 0, 0, 0, 0};
        return noten;
    }
 
  
    static int[] sort(int [] punkte, int [] noten) 
	{
		for(int i = 1; i < punkte.length; i++)
		{
			if (punkte[i] >= 92 && punkte[i] <= 100)
				noten[0]++;
			if (punkte[i] >= 81 && punkte[i] <= 91) 
				noten[1]++;
			if (punkte[i] >= 67 && punkte[i] <= 80) 
				noten[2]++;
			if (punkte[i] >= 50 && punkte[i] <= 66) 
				noten[3]++;
			if (punkte[i] >= 30 && punkte[i] <= 49) 
				noten[4]++;
			if (punkte[i] >= 0 && punkte[i] <= 29) 
				noten[5]++;
		}	
		int[] notenNEW = {noten[0], noten[1], noten[2], noten[3], noten[4], noten[5]};	
		
		return notenNEW;
	}
	
	
	static int mittelwertPunkte(int [] punkte) 
	{
		int summeP = 0;       
		for(int i:punkte) 
		{
			summeP += i;
		} 
		return summeP/punkte.length;
	}
	
	static int mittelwertNoten(int [] notenNEW) 
	{
		int summeNoten = 0;
		
		for(int i = 1; i < notenNEW.length; i++)
		{
			summeNoten += notenNEW[i];   
		}
		return summeNoten / notenNEW.length;
	}
	
	
	static void Notenspiegel(int [] noten) 
	{
		System.out.println("\n1\t2\t3\t4\t5\t6");
		System.out.println("-------------------------------------------");
		System.out.println(noten[0]+"\t"+noten[1]+"\t"+noten[2]+"\t"+noten[3]+"\t"+noten[4]+"\t"+ noten[5] );
	}
	
	
	static void legende(int [] noten)
	{
		System.out.println("\n----------------------------------------------------------");
		System.out.println("|Prozent\t|Note\t|Bewertung \t\t|Vorkommen ");
		System.out.println("|----------------------------------------------------------");
		System.out.println("|100-92\t\t|1\t|sehr gut \t\t|"+noten[0]);
		System.out.println("|----------------------------------------------------------");
		System.out.println("|91-81\t\t|2\t|gut \t\t\t|"+noten[1]);
		System.out.println("|----------------------------------------------------------");
		System.out.println("|80-67\t\t|3\t|befriedigendt \t\t|"+noten[2]);
		System.out.println("|----------------------------------------------------------");
		System.out.println("|66-50\t\t|4\t|ausreichendt \t\t|"+noten[3]);
		System.out.println("|----------------------------------------------------------");
		System.out.println("|49-30\t\t|5\t|mangelhaft \t\t|"+noten[4]);
		System.out.println("|----------------------------------------------------------");
		System.out.println("|29-0\t\t|6\t|ungenügendt \t\t|"+noten[5]);
	}
	
	static void clrscr()
	{
		System.out.print("\033[H\033[2J"); 
		System.out.flush();
	}
}
