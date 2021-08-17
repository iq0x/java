import java.util.Scanner;

public class Main
{
       public static void main (String[] args)
       {
              Scanner input = new Scanner(System.in);

              double a;
              double b;
              double result_area;
              double result_umfang;

              System.out.println("a : ");
              a = input.nextDouble();
              System.out.println("b : ");
              b = input.nextDouble();

              result_area = a * b;
              result_umfang = (a+b)*2;

              System.out.println("a: " + a);
              System.out.println("b: " + b);
              System.out.println("area= " + result_area);
              System.out.println("u8mpfang= " + result_umfang);
       }
}
