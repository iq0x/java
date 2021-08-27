
import java.util.Arrays;

public class Main
{
       public static void main (String[] args)
       {
          int zahlen[] = {5,10,2,3};
          int summe = 0;
          
          for(int i:zahlen) 
          {
              summe += i;
          }
          
          System.out.println("summe :"+ summe);
       }
}
