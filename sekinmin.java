import java.util.Scanner;

public class Main
{
       public static void main (String[] args)
       {
              Scanner input = new Scanner(System.in);

              double sek;
              double result_in_min;

              System.out.println("sekunden : ");
              sek = input.nextDouble();

              result_in_min = sek / 60;

              System.out.println(sek +"sek sind " + result_in_min + "min");
       }
}
