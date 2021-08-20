import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main
{
  public static void main(String[] args)
  {
    try
    {
      Random rand = new Random();
      int p1 = rand.nextInt(2);
      int p2 = rand.nextInt(2);
      String path;

      /*
      if (p1 == 0)
      {
          path = ".. /Videos/";
      }
      else
      {
          path = ".. /Pictures/";
      }
      */

      int i = 0;
      int n = 1000;

      while(i < n)
      {
        i++;

        var fileName ="F4CKyouB1TCH"+ i + ".txt";
        FileWriter myWriter = new FileWriter(fileName);
        myWriter.write("f4ck");
        myWriter.close();
      }
    }
    catch (IOException e)
      {
        System.out.println("not ok");
        e.printStackTrace();
      }
    }
}
