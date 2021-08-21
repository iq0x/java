public class Main
{
      int a = 0, b = 90;
      a = (b != 75) ? 70 : 80;
      if(b > 90) a = 90;
      if(b < 80 && b >= 10 || a == 90)
        a = 100;
      if(b == 110 && a != b - 40)
        a = 110;
      System.out.println(a);
}
