
public class Main
{
       public static void main (String[] args)
       {
             double gewicht = 12;
             double preis = 0;

             System.out.println("versandkosten");
             if (gewicht <= 0)
             {
               System.out.println("kein mindestgewicht");
             }
             else
             {

             if (gewicht > 20)
             {
                 System.out.println("paket kann nicht versendet werdeN!");
             }
             else
             {
                if (gewicht >= 5 && gewicht <= 10)
                {
                   preis = 10.50;
                }

                else if (gewicht > 10 && gewicht < 20)
                {
                   preis = 14;
                }
                else
                {
                  preis = 7;
                }
             }
               System.out.println(preis);
           }


       }
}
