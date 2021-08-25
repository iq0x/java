public class Main
{
       public static void main (String[] args)
       {
			String text = "1BB456!8";
			
            int count = 0;
            char G;    
			int buchstaben = 0;
			int ziffern = 0;
			
			boolean letter_check = false;
			boolean number_check = false;
			boolean sonderzeichen_check = false;
			boolean minzeichen_check = false;
			boolean bigletter_check = false;
			
     		int leange = text.length();
     		
     		System.out.print("dein passwort lautet: ");
     		
			while (count < leange)
			{
				G = text.charAt(count);
				
				if (Character.isLetter(G)) buchstaben++;
				if (Character.isDigit(G)) ziffern++;
				if (Character.isUpperCase(G)) bigletter_check = true;
				
				System.out.print(G); // <- der ist gut lol^^
				count++;	
			}
			
			System.out.println();
			
			if (count < 8)
			{
				System.out.println("mindestens 8 zeichen");
			}
			
			else
			{
				minzeichen_check = true;
				
				if (text.matches("^[a-zA-Z0-9]+")) System.out.println("* kein sonderzeichen drinne");
				else sonderzeichen_check = true;
					
				if (bigletter_check == false) System.out.println("* kein gross buchstabe");
				else bigletter_check = true;
					
				if (buchstaben < 2) System.out.println("* mindestens 2 buchstaben");
				else letter_check = true;
						
				if (ziffern < 2) System.out.println("* mindestens 2 ziffern");
				else number_check = true;	
			}
			
			if (minzeichen_check == true && sonderzeichen_check == true && letter_check == true && number_check == true && bigletter_check == true)
				System.out.println("heftiges passwort");
			else
				System.out.println("\nkonzentrier dich!!!! und mach es nochmal n00b");
				
       }
}
	

				

