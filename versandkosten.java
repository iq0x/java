
public class Main
{
       public static void main (String[] args)
       {
             double gewicht = 1;

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
                   System.out.println("10,50Euro");
                }

                else if (gewicht > 10 && gewicht < 20)
                {
                   System.out.println("14Euro");
                }
                else
                {
                  System.out.println("7Euro");
                }
             }
           }


       }
}
