
public class Main
{
       public static void main (String[] args)
       {
            String text = "oTto otto.";
            String tmp = "";
            String result = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
            int length = result.length();
            String prefix;

            for (int i = length - 1; i >= 0; i--)
              tmp = tmp + result.charAt(i);

            if (result.equals(tmp))
               prefix = " ist ein palindrom";
            else
               prefix = " ist kein palindrom";
               
          System.out.println(result + prefix);
       }
}
