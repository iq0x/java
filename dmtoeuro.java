import java.util.Scanner;

public class Main
{
       public static void main (String[] args)
       {
              Scanner input = new Scanner(System.in);

              double dm;
              double result_in_euro;

              System.out.println("DM : ");
              dm = input.nextDouble();

              result_in_euro = dm / 1.95583;

              System.out.println(dm +"DM sind " + result_in_euro + "Euro");
       }
}
