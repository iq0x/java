
public class Main
{
       public static void main (String[] args)
       {
            String nachname = "Dom";
            String vorname = "helmut";
            String titel = "dr";
            int alter = 29;
            char geschlecht = 'm';

            System.out.println("anrede");

              if (alter < 18)
              {
                  System.out.println("hello" + vorname);
              }
              else
              {
                if (titel == "dr")
                {
                  if (geschlecht == 'w')
                  {
                       System.out.println("Sehr geehrte Frau Dr " + nachname);
                  }
                  else
                  {
                      System.out.println("Sehr geehrter Herr Dr " + nachname);
                  }
                }

                else
                {
                  if (geschlecht == 'w')
                  {
                       System.out.println("Sehr geehrte Frau " + nachname);
                  }
                  else
                  {
                      System.out.println("Sehr geehrter Herr " + nachname);
                  }
                }
              }

       }
}
