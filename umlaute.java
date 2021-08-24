public class Main
{
       public static void main (String[] args)
       {
			String text = "tÄsöööööööööööööüöäüöäüöüöääöüüäööäüööäüöäüüöäüöäüöäüöäüöäüäöüäüäüäüöäüäöüöäüöüöäüöäööööö";
            
            int count = 0;
            int umlauteA = 0;
            int umlauteU = 0;
            int umlauteO = 0;
            
            while (count < text.length())
            {
                  char G = text.charAt(count);
                  System.out.print(G);
                  count++;
                  if (G == 'Ä' || G == 'ä')
					umlauteA++;
				  if (G == 'ü' || G == 'Ü')
					umlauteU++;
				   if (G == 'Ö' || G == 'ö')
					umlauteO++;
            }
            System.out.println();
            System.out.println("umlauteA: "+ umlauteA);
            System.out.println("umlauteU: "+ umlauteU);
            System.out.println("umlauteO: "+ umlauteO);
       }
}
