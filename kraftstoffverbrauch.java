import java.util.Scanner;

public class Main
{
       public static void main (String[] args)
       {
              Scanner input = new Scanner(System.in);

              double km;
              double result;
              double resultD;

              System.out.println("km : ");
              km = input.nextDouble();

              result = km * 0.069583333;

              System.out.println(km + "km: " + result);
       }
}
