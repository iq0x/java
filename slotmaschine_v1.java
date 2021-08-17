import java.util.Random;

public class slotmaschine
{
  public static void main (String[] args)
  {
    System.out.println("Slotmaschine");

    int i = 0;
    int n = 30;

    while(i<n)
    {
      i++;
      Random rand = new Random();

      int field1 = rand.nextInt(3);
      int field2 = rand.nextInt(3);
      int field3 = rand.nextInt(3);

      System.out.println(field1 + " " + field2 + " " + field2);

      if (field1 == 1 && field2 == 1 && field3 == 1)
      {
        System.out.println("you win 100 Dollar!");
      }

      else if (field1 == 2 && field2 == 2 && field3 == 2)
      {
        System.out.println("you win 200 Dollar!");
      }

      else if (field1 == 0 && field2 == 0 && field3 == 0)
      {
        System.out.println("you win 50 Dollar!");
      }

      else
      {
        System.out.println("looser!");
      }
    }
  }
}
