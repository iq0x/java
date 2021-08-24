public class Main
{
       public static void main (String[] args)
       {
		   System.out.println("Einzelne Schleifen 1");
		   int i = 5;
		   while(i <= 12)
		   {
			   System.out.print(i+" ");
			   i++;
		   }
		   System.out.println();
		   
		   
		   
		   System.out.println("Einzelne Schleifen 2");
		   int i2 = 24;
		   while(i2 >= 18)
		   {
			   System.out.print(i2+" ");
			   i2--;
		   }
		   System.out.println();
		   
		   
		   
		   System.out.println("Einzelne Schleifen 3");
		   int i3 = 7;
		   while(i3 <= 19)
		   {
			   System.out.print(i3+" ");
			   i3=i3+2;
		   }
		   System.out.println();
		   
		   
		   
		   System.out.println("Einzelne Schleifen 4");
		   int i4 = 20;
		   while(i4 >= 0)
		   {
			   System.out.print(i4+" ");
			   i4=i4-4;
		   }
		   System.out.println();
		   
		   
		   
		   System.out.println("Einzelne Schleifen 5");
		   int i5 = -3;
		   while(i5 <= 3)
		   {
			   System.out.print(i5+" ");
			   i5=i5-(-1);
		   }
		   System.out.println();
		   
		   
		   
		   System.out.println("Einzelne Schleifen 6");
		   int i6 = 27;
		   while(i6 >= 1)
		   {
			   System.out.print(i6+" ");
			   i6=i6/3;
		   }
		   System.out.println();
		   
		   
		   
		   System.out.println("Einzelne Schleifen 7");
		   int i7 = 5;
		   while(i7 <= 80)
		   {
			   System.out.print(i7+" ");
			   i7=i7*2;
		   }
		   System.out.println();
		   
		   
		   
		   System.out.println("Einzelne Schleifen 8");
		   int i8 = 1;
		   while(i8 <= 8)
		   {
			   System.out.print(i8+" ");
			   i8++;
		   }
		   
		   int i88 = 10;
		   while(i88 <= 14)
		   {
			   System.out.print(i88+" ");
			   i88++;
		   }
		   System.out.println();
		   
		   
		   
		   
		   System.out.println("Einzelne Schleifen 9");
		   int i9 = 1;
		   while(i9 <= 9)
		   {
			   i9++;
				if (i9 % 2 == 0)
					System.out.print(".");
				else
					System.out.print(":");
		   }
		   System.out.println();
		   
		   
		   
		   System.out.println("Einzelne Schleifen 10");
		   int i10 = 5;
		   int result = 0;
		   while(i10 <= 10)
		   {
			   result = result + i10;
			   System.out.print(i10 +" ");
			   i10++;
			   
		   }
		   System.out.print(result);
		   System.out.println();
		   
		   
		   
  System.out.println("0 und +");
		   	int x = 1;
	
			while(x < 100)
			{
					x++;
				if (x % 2 == 0)
					System.out.print("0");
				else 
					System.out.print("+");
				if (x % 10 == 0)
					System.out.println();
			}
		   
		   System.out.println();
		   
		   
		   System.out.println("1 x5 matrix");
		   int x1 = 1;
	
		while(x1 <= 5)
		{
				int y1 = 1;
				while(y1 <= 5)
				{
					System.out.print(y1+x1+"\t");
					y1++;
				}	
				System.out.println();
				System.out.println("");
				x1++;	
		}
		
		
		
		  System.out.println("sternchen");
		   int k = 0;
		   int l;
	
			while(k <= 7)
			{
					l = 0;
					
					while(l <= k)
					{
						
						l++;
						System.out.print(" ");
			
					
					}	
					System.out.print("X");
					System.out.println();
					k++;	
			}
       } 
}
