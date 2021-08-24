public class Main
{
       public static void main (String[] args)
       {
			String text = "tÄsöööööööööööööüöäüöäüöüöääöüüäööäüööäüöäüüöäüöäüöäüöäüöäüäöüäüäüäüöäüäöüöäüöüöäüöäööööö";
            
            int count = 0;
            int umlaute = 0;
            
            while (count < text.length())
            {
                  char G = text.charAt(count);
                  System.out.print(G);
                  count++;
                  if (G == 'Ä' || G == 'ä' || G == 'Ö' || G == 'ö' || G == 'Ü'|| G == 'ü')
					umlaute++;
            }
            System.out.println();
            System.out.println("umlaute: "+ umlaute);
       }
}
